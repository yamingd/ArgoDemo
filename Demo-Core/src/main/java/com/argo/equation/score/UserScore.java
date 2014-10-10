package com.argo.equation.score;

import com.argo.core.base.BaseEntity;
import com.argo.core.annotation.EntityDef;
import com.argo.core.annotation.PK;
import java.util.Date;

/**
 * Created by $User on 2014-10-08 17:10.
 */
@EntityDef(table = "user_score")
public class UserScore extends BaseEntity {
    
    
    /**
     * 
     * 
     */
    @PK("userId")
	private Integer userId;
    
    /**
     * 
     * 
     */
    private Integer total;
    
    /**
     * 
     * 
     */
    private Date updateAt;
    
    /**
     * 
     * 
     */
    private Date createAt;
    

    @Override
    public String getPK() {
        return  ":" + userId ;
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
    public Integer getTotal(){
        return this.total;
    }
    public void setTotal(Integer total){
        this.total = total;
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
    
}