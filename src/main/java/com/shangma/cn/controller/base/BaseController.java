package com.shangma.cn.controller.base;

import com.shangma.cn.common.http.AxiosResult;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 20:06
 */

public class BaseController<T,ID> {

    public AxiosResult<Void> toAxios(int row){
        if (row>0){
            return AxiosResult.success();
        }
        return AxiosResult.error();
    }

}

