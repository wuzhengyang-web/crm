package com.shangma.cn.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangma.cn.dto.ReturnFactoryOut;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.Returnfactory;
import com.shangma.cn.entity.ReturnfactoryExample;
import com.shangma.cn.mapper.ReturnfactoryMapper;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.ReturnfactoryService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:01
 */
@Service
public class ReturnfactoryServiceImpl extends BaseServiceImpl<Returnfactory,Long> implements ReturnfactoryService {

    @Autowired
    private ReturnfactoryMapper returnfactoryMapper;
    @Override
    public PageVo<Returnfactory> findByConditions(ReturnFactoryOut factoryOut) {
        ReturnfactoryExample example = new ReturnfactoryExample();
        ReturnfactoryExample.Criteria criteria = example.createCriteria();
        if (factoryOut.getId()!=null){
            criteria.andIdEqualTo(factoryOut.getId());
        }
        if (factoryOut.getReturnMark()!=null){
            criteria.andReturnMarkEqualTo(factoryOut.getReturnMark());
        }
        if (factoryOut.getApproverStatus()!=null){
            criteria.andApproverStatusEqualTo(factoryOut.getApproverStatus());
        }
        if (factoryOut.getApproverName()!=null){
            criteria.andApproverNameEqualTo(factoryOut.getApproverName());
        }
        if (factoryOut.getAddStartTime()!=null&&factoryOut.getAddEndTime()!=null){
            criteria.andAddTimeBetween(factoryOut.getAddStartTime(),factoryOut.getAddEndTime());
        }
        if (factoryOut.getApproverStartTime()!=null&&factoryOut.getApproverEndTime()!=null){
            criteria.andApproverTimeBetween(factoryOut.getApproverStartTime(),factoryOut.getApproverEndTime());
        }

        List<Returnfactory> returnfactories = returnfactoryMapper.selectByExample(example);
        PageVo<Returnfactory> returnfactoryPageVo = new PageVo<>();
        PageInfo<Returnfactory> pageInfo = new PageInfo<>(returnfactories);
        returnfactoryPageVo.setList(returnfactories);
        returnfactoryPageVo.setTotal(pageInfo.getTotal());
        return returnfactoryPageVo;
    }
}
