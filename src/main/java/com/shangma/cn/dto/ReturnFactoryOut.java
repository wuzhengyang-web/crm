package com.shangma.cn.dto;

import com.shangma.cn.entity.Returnfactory;
import lombok.Data;

import java.util.Date;

/**
    封装前端的返厂出库查询条件
 */
@Data
public class ReturnFactoryOut extends Returnfactory {
    /**
     * 制单 开始时间
     */
    private Date addStartTime;
    /**
     * 制单  结束时间
     */
    private Date addEndTime;

    /**
     * 审批开始时间
     */
    private Date approverStartTime;

    /**
     *审批结束时间
     */
    private Date approverEndTime;
}
