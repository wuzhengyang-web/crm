package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Category extends BaseEntity<Long> {

    private String categoryName;

    private String categoryDesc;

    private Long parentid;

    private List<Category> children;

}