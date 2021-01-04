package com.shangma.cn.controller.base;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:06
 */

public class BaseController<T,ID> {
    @Autowired
    private BaseService<T,ID> baseService;

    @GetMapping
    public AxiosResult<PageVo<T>> findPage(@RequestParam(defaultValue = "1")int currentPage,
                                           @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<T> page = baseService.findAll();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<T> findById(@PathVariable ID id){
        return AxiosResult.success(baseService.findById(id));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody T entity){
        return toAxios(baseService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody T entity){
        return toAxios(baseService.updateEntity(entity));
    }
    @DeleteMapping("{id}")
    public AxiosResult<T> deleteById(@PathVariable ID id){
        return AxiosResult.success(baseService.findById(id));
    }

    public AxiosResult<Void> toAxios(int row){
        if (row>0){
            return AxiosResult.success();
        }
        return AxiosResult.error();
    }

}

