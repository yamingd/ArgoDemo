package com.equation.member;

import com.argo.core.base.BaseEntity;
import com.argo.core.annotation.EntityDef;
import com.argo.core.annotation.PK;
import java.util.Date;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@EntityDef(table = "invite")
public class Invite extends BaseEntity {
    
    
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
    private Integer userId;
    
    /**
     * 
     * 
     */
    private Date createAt;
    
    /**
     * 
     * 默认为: 0
     */
    private Integer confirmed;
    
    /**
     * 
     * 
     */
    private Date confirmAt;
    
    /**
     * 邀请人邮箱
     * 
     */
    private String email;
    

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
    public Date getCreateAt(){
        return this.createAt;
    }
    public void setCreateAt(Date createAt){
        this.createAt = createAt;
    }
    
    /**
     * 
     * 默认为: 0
     */
    public Integer getConfirmed(){
        return this.confirmed;
    }
    public void setConfirmed(Integer confirmed){
        this.confirmed = confirmed;
    }
    
    /**
     * 
     * 
     */
    public Date getConfirmAt(){
        return this.confirmAt;
    }
    public void setConfirmAt(Date confirmAt){
        this.confirmAt = confirmAt;
    }
    
    /**
     * 邀请人邮箱
     * 
     */
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
}