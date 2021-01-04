package com.shangma.cn.controller;

import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:05
 */
@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,String> {
}
