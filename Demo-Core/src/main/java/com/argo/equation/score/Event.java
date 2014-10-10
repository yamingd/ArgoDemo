package com.argo.equation.score;

import com.argo.core.base.BaseEntity;
import com.argo.core.annotation.EntityDef;
import com.argo.core.annotation.PK;
import java.util.Date;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@EntityDef(table = "event")
public class Event extends BaseEntity {
    
    
    /**
     * 
     * 
     */
    @PK("id")
	private Integer id;
    
    /**
     * 
     * 
     */
    private String name;
    
    /**
     * 
     * 
     */
    private String title;
    
    /**
     * 本人的积分
     * 
     */
    private Integer score0;
    
    /**
     * 推荐人的积分
     * 默认为: 0
     */
    private Integer score1;
    
    /**
     * 
     * 默认为: 1
     */
    private Integer enabled;
    
    /**
     * 
     * 
     */
    private Date createAt;
    
    /**
     * 
     * 
     */
    private Date startAt;
    
    /**
     * 
     * 
     */
    private Date endAt;
    

    @Override
    public String getPK() {
        return  ":" + id ;
    }

    
    /**
     * 
     * 
     */
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    
    /**
     * 
     * 
     */
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * 
     * 
     */
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * 本人的积分
     * 
     */
    public Integer getScore0(){
        return this.score0;
    }
    public void setScore0(Integer score0){
        this.score0 = score0;
    }
    
    /**
     * 推荐人的积分
     * 默认为: 0
     */
    public Integer getScore1(){
        return this.score1;
    }
    public void setScore1(Integer score1){
        this.score1 = score1;
    }
    
    /**
     * 
     * 默认为: 1
     */
    public Integer getEnabled(){
        return this.enabled;
    }
    public void setEnabled(Integer enabled){
        this.enabled = enabled;
    }
    
    /**
     * 
     * 
     */
    public Date getCreateAt(){
        return this.createAt;
    }
    public void setCreateAt(Date createAt){
        this.createAt = createAt;
    }
    
    /**
     * 
     * 
     */
    public Date getStartAt(){
        return this.startAt;
    }
    public void setStartAt(Date startAt){
        this.startAt = startAt;
    }
    
    /**
     * 
     * 
     */
    public Date getEndAt(){
        return this.endAt;
    }
    public void setEndAt(Date endAt){
        this.endAt = endAt;
    }
    
}