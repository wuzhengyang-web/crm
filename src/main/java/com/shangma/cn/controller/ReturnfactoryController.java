package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.ReturnFactoryOut;
import com.shangma.cn.entity.Returnfactory;
import com.shangma.cn.service.ReturnfactoryService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-07 16:35
 */
@RestController
@RequestMapping("returnFactory")
public class ReturnfactoryController extends BaseController<Returnfactory,Long> {
    @Autowired
    private ReturnfactoryService returnfactoryService;


    @GetMapping
    public AxiosResult<PageVo<Returnfactory>> findPage(@RequestParam(defaultValue = "1")int currentPage,
                                               @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Returnfactory> page = returnfactoryService.findAll();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Returnfactory> findById(@PathVariable Long id){
        return AxiosResult.success(returnfactoryService.findById(id));
    }
    @PostMapping("/searchByConditions")
    public AxiosResult<PageVo<Returnfactory>> searchByConditions(@RequestParam(defaultValue = "1")int currentPage,
                                                                 @RequestParam(defaultValue = "5")int pageSize,@RequestBody ReturnFactoryOut factoryOut){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Returnfactory> page = returnfactoryService.findByConditions(factoryOut);
        return AxiosResult.success(page);

    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Returnfactory entity){
        return toAxios(returnfactoryService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Returnfactory entity){
        return toAxios(returnfactoryService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Long> deleteById(@PathVariable List<Long> ids){
        int i = returnfactoryService.batchDeleteByIds(ids);
        if (i>0){
            return AxiosResult.success();
        }else {
            return AxiosResult.error();
        }
    }
}
