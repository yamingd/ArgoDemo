package com.equation.score;

import com.argo.core.base.BaseEntity;
import com.argo.core.annotation.EntityDef;
import com.argo.core.annotation.PK;
import java.util.Date;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@EntityDef(table = "score")
public class Score extends BaseEntity {
    
    
    /**
     * 
     * 
     */
    @PK("id")
	private Long id;
    
    /**
     * 
     * 
     */
    private Integer eventId;
    
    /**
     * 
     * 
     */
    private Integer userId;
    
    /**
     * 
     * 
     */
    private Integer score0;
    
    /**
     * 
     * 
     */
    private Date createAt;
    
    /**
     * 
     * 
     */
    private Integer toUserId;
    
    /**
     * 
     * 
     */
    private Integer score1;
    
    /**
     * 是否生效
     * 默认为: 1
     */
    private Integer enabled;
    
    /**
     * 是否已经统计
     * 默认为: 0
     */
    private Integer instock;
    
    /**
     * 纳入统计时间
     * 
     */
    private Date stockAt;
    
    /**
     * 
     * 
     */
    private Date updateAt;
    

    @Override
    public String getPK() {
        return  ":" + id ;
    }

    
    /**
     * 
     * 
     */
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
    /**
     * 
     * 
     */
    public Integer getEventId(){
        return this.eventId;
    }
    public void setEventId(Integer eventId){
        this.eventId = eventId;
    }
    
    /**
     * 
     * 
     */
    public Integer getUserId(){
        return this.userId;
    }
    public void setUserId(Integer userId){
        this.userId = userId;
    }
    
    /**
     * 
     * 
     */
    public Integer getScore0(){
        return this.score0;
    }
    public void setScore0(Integer score0){
        this.score0 = score0;
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
    public Integer getToUserId(){
        return this.toUserId;
    }
    public void setToUserId(Integer toUserId){
        this.toUserId = toUserId;
    }
    
    /**
     * 
     * 
     */
    public Integer getScore1(){
        return this.score1;
    }
    public void setScore1(Integer score1){
        this.score1 = score1;
    }
    
    /**
     * 是否生效
     * 默认为: 1
     */
    public Integer getEnabled(){
        return this.enabled;
    }
    public void setEnabled(Integer enabled){
        this.enabled = enabled;
    }
    
    /**
     * 是否已经统计
     * 默认为: 0
     */
    public Integer getInstock(){
        return this.instock;
    }
    public void setInstock(Integer instock){
        this.instock = instock;
    }
    
    /**
     * 纳入统计时间
     * 
     */
    public Date getStockAt(){
        return this.stockAt;
    }
    public void setStockAt(Date stockAt){
        this.stockAt = stockAt;
    }
    
    /**
     * 
     * 
     */
    public Date getUpdateAt(){
        return this.updateAt;
    }
    public void setUpdateAt(Date updateAt){
        this.updateAt = updateAt;
    }
    
}