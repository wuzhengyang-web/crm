package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Returngoods;
import com.shangma.cn.service.ReturngoodsService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-07 16:35
 */
@RestController
@RequestMapping("returnGoods")
public class ReturnGoodsController extends BaseController<Returngoods,Long> {
    @Autowired
    private ReturngoodsService returngoodsService;

    @GetMapping
    public AxiosResult<PageVo<Returngoods>> findPage(@RequestParam(defaultValue = "1")int currentPage,
                                               @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Returngoods> page = returngoodsService.findAll();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Returngoods> findById(@PathVariable Long id){
        return AxiosResult.success(returngoodsService.findById(id));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Returngoods entity){
        return toAxios(returngoodsService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Returngoods entity){
        return toAxios(returngoodsService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Long> deleteById(@PathVariable List<Long> ids){
        int i = returngoodsService.batchDeleteByIds(ids);
        if (i>0){
            return AxiosResult.success();
        }else {
            return AxiosResult.error();
        }
    }
}
