package com.shangma.cn.service;

import com.shangma.cn.dto.ReturnFactoryOut;
import com.shangma.cn.entity.Returnfactory;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * @author shangmaxueyuan
 * @create 2021-01-07 16:32
 */
public interface ReturnfactoryService extends BaseService<Returnfactory,Long> {
    PageVo<Returnfactory> findByConditions(ReturnFactoryOut factoryOut);
}
