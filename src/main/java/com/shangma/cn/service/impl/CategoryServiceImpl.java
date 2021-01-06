package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Category;
import com.shangma.cn.mapper.CategoryMapper;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:03
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getTreeData() {
        /**
         * 查询所有
         *
         * 通过 父id =0 拿到一级
         * 遍历一级数据  通过一级数据拿到二级数据
         *
         * 遍历二级数据  list<Category>
         *
         * 遍历三级数据  list<Category>
         *
         */
        List<Category> categories = categoryMapper.selectByExample(null);
        //过滤出来一级数据
        List<Category> root = categories.stream().filter(category -> category.getParentid().equals(0L)).collect(Collectors.toList());
        root.forEach(item -> {
            getChildren(categories, item);
        });
        return root;
    }

    public void getChildren(List<Category> categories, Category category) {
        List<Category> childrenList = categories.stream().filter(item -> item.getParentid().equals(category.getId())).collect(Collectors.toList());
        if (childrenList.size() > 0) {
            category.setChildren(childrenList);
            childrenList.forEach(item -> {
                getChildren(categories, item);
            });
        }
    }

    @Override
    public int batchDeleteByIds(List<Long> longs) {
        Category category = categoryMapper.selectByPrimaryKey(longs.get(0));
        List<Category> categories = categoryMapper.selectByExample(null);
        List<Category> delCategories = new ArrayList<>();
        delCategories.add(category);
        deleteByParent(categories, category, delCategories);
        return 1;
    }

    public void deleteByParent(List<Category> categories, Category category, List<Category> delCategories) {
        List<Category> collect = categories.stream().filter(item -> item.getParentid().equals(category.getId())).collect(Collectors.toList());
        if (collect.size() > 0) {
            delCategories.addAll(collect);
            collect.forEach(item -> {
                deleteByParent(categories, item, delCategories);
            });
        } else {
            delCategories.forEach(item -> categoryMapper.deleteByPrimaryKey(item.getId()));
        }
    }
}
