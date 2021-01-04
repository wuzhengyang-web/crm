package com.shangma.cn.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:09
 */
@Data
public class BaseEntity<ID> {
    private String id;
    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;
}
