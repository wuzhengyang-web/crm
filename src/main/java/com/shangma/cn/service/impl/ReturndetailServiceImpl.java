package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Returndetail;
import com.shangma.cn.entity.Returnfactory;
import com.shangma.cn.mapper.ReturndetailMapper;
import com.shangma.cn.mapper.ReturnfactoryMapper;
import com.shangma.cn.service.ReturndetailService;
import com.shangma.cn.service.ReturnfactoryService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:01
 */
@Service
public class ReturndetailServiceImpl extends BaseServiceImpl<Returndetail,Long> implements ReturndetailService {
    @Autowired
    private ReturnfactoryMapper returnfactoryMapper;
    @Autowired
    private ReturndetailMapper returndetailMapper;

}
