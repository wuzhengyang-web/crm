package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Returndetail;
import com.shangma.cn.service.ReturndetailService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-07 16:35
 */
@RestController
@RequestMapping("returnDetail")
public class ReturnDetailController extends BaseController<Returndetail,Long> {
    @Autowired
    private ReturndetailService returndetailService;

    @GetMapping
    public AxiosResult<PageVo<Returndetail>> findPage(@RequestParam(defaultValue = "1")int currentPage,
                                               @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Returndetail> page = returndetailService.findAll();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Returndetail> findById(@PathVariable Long id){
        return AxiosResult.success(returndetailService.findById(id));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Returndetail entity){
        return toAxios(returndetailService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Returndetail entity){
        return toAxios(returndetailService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Long> deleteById(@PathVariable List<Long> ids){
        int i = returndetailService.batchDeleteByIds(ids);
        if (i>0){
            return AxiosResult.success();
        }else {
            return AxiosResult.error();
        }
    }
}
