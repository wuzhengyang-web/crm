package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:09
 */
@Data
public class BaseEntity<ID> {
    private ID id;
    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    public void setDate(){
        if (id==null){
            this.addTime=new Date();
            this.creatorId=1L;
        }
            this.updateTime=new Date();
            this.updateId=2L;

    }
}
