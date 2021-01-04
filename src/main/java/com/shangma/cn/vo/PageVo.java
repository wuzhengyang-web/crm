package com.shangma.cn.vo;

import lombok.Data;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 17:29
 */
@Data
public class PageVo<T> {
    List<T> list;
    long total;
}
