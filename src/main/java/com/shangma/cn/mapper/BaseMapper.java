package com.shangma.cn.mapper;

import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.BrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 17:25
 */
public interface BaseMapper<T,ID> {
    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
