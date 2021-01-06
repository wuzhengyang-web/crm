package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:14
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier,Long> {
    /**
     * 问题： 为什么不用 BaseController
     *
     */
    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public AxiosResult<PageVo<Supplier>> findPage(@RequestParam(defaultValue = "1")int currentPage,
                                               @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Supplier> page = supplierService.findAll();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Supplier> findById(@PathVariable Long id){
        return AxiosResult.success(supplierService.findById(id));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Supplier entity){
        return toAxios(supplierService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Supplier entity){
        return toAxios(supplierService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Long> deleteById(@PathVariable List<Long> ids){
        int i = supplierService.batchDeleteByIds(ids);
        if (i>0){
            return AxiosResult.success();
        }else {
            return AxiosResult.error();
        }
    }
}
