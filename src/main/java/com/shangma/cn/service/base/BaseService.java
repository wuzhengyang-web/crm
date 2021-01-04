package com.shangma.cn.service.base;

import com.shangma.cn.vo.PageVo;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 17:28
 */
public interface BaseService <T,ID>{
    PageVo<T> findAll();

    PageVo<T> findAll(Object example);

    T findById(ID id);

    int addEntity(T entity);

    int updateEntity(T entity);

    int deleteById(ID id);

    int batchDeleteByIds(List<ID> ids);

    PageVo<T> setPageVo(List<T> ts);
}
