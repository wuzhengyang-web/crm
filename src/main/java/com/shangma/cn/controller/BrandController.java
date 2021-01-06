package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:05
 */
@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,Long> {
    @Autowired
    private BrandService brandService;

    @GetMapping
    public AxiosResult<PageVo<Brand>> findPage(@RequestParam(defaultValue = "1")int currentPage,
                                                  @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Brand> page = brandService.findAll();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable Long id){
        return AxiosResult.success(brandService.findById(id));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity){
        return toAxios(brandService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity){
        return toAxios(brandService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Long> deleteById(@PathVariable List<Long> ids){
        int i = brandService.batchDeleteByIds(ids);
        if (i>0){
            return AxiosResult.success();
        }else {
            return AxiosResult.error();
        }
    }
}
