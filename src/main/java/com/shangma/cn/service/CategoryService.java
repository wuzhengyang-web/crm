package com.shangma.cn.service;

import com.shangma.cn.entity.Category;
import com.shangma.cn.service.base.BaseService;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:01
 */
public interface CategoryService  extends BaseService<Category,Long> {
    List<Category> getTreeData();
}
