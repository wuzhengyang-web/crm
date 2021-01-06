package com.shangma.cn.service.base.impl;

import com.github.pagehelper.PageInfo;
import com.shangma.cn.mapper.base.BaseMapper;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.utils.ReflectionUtils;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 19:51
 */
public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {
    @Autowired
    BaseMapper<T, ID> baseMapper;

    /**
     * 查询所有
     * @return
     */
    @Override
    public PageVo<T> findAll() {
        return setPageVo(baseMapper.selectByExample(null));
    }

    /**
     * 查询所有带条件
     *
     * @param example
     * @return
     */
    @Override
    public PageVo<T> findAll(Object example) {

        return setPageVo(baseMapper.selectByExample(example));
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    /**
     * 添加
     *
     * @param entity
     * @return
     */
    @Override
    public int addEntity(T entity) {
        ReflectionUtils.invokeMethod(entity, "setDate", null, null);
        return baseMapper.insert(entity);

    }

    /**
     * 修改
     *
     * @param entity
     * @return
     */
    @Override
    public int updateEntity(T entity) {
        ReflectionUtils.invokeMethod(entity, "setDate", null, null);
        return baseMapper.updateByPrimaryKey(entity);

    }

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @Override
    @Transactional
    public int batchDeleteByIds(List<ID> ids) {
        ids.forEach(item -> baseMapper.deleteByPrimaryKey(item));
        return 1;
    }

    /**
     * 封装pageVo
     *
     * @param ts
     * @return
     */
    @Override
    public PageVo<T> setPageVo(List<T> ts) {
        PageInfo<T> pageInfo = new PageInfo<>(ts);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setTotal(total);
        pageVo.setList(ts);
        return pageVo;
    }
}
