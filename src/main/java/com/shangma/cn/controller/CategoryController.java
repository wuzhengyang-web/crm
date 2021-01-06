package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Category;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shangmaxueyuan
 * @create 2021-01-06 16:14
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("getTreeData")
    public AxiosResult<List<Category>> getTreeData(){
        List<Category> list=categoryService.getTreeData();
        return AxiosResult.success(list);
    }

    @GetMapping
    public AxiosResult<PageVo<Category>> findPage(@RequestParam(defaultValue = "1")int currentPage,
                                                  @RequestParam(defaultValue = "5")int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Category> page = categoryService.findAll();
        return AxiosResult.success(page);
    }
    @GetMapping("{id}")
    public AxiosResult<Category> findById(@PathVariable Long id){
        return AxiosResult.success(categoryService.findById(id));
    }
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Category entity){
        return toAxios(categoryService.addEntity(entity));
    }
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Category entity){
        return toAxios(categoryService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Long> deleteById(@PathVariable List<Long> ids){
        int i = categoryService.batchDeleteByIds(ids);
        if (i>0){
            return AxiosResult.success();
        }else {
            return AxiosResult.error();
        }
    }

}
