package com.shangma.cn.common.http;

import lombok.Data;

/**
 * @author shangmaxueyuan
 * @create 2021-01-02 16:12
 */
@Data
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;

    private AxiosResult(){

    }
    //封装数据公共方法
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus,T data){
        AxiosResult<T> axiosResult=new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        return axiosResult;
    }

    /**
     * 成功返回
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(){
      return   setData(AxiosStatus.OK,null);
    }

    /**
     * 成功返回 ,带数据
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(T data){
        return   setData(AxiosStatus.OK,data);
    }
    /**
     * 成功返回  自定义状态码
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return   setData(axiosStatus,null);
    }
    /**
     * 成功返回 ,带数据, 自定义状态码
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return   setData(axiosStatus,data);
    }
    /**
     * 错误返回
     */
    /**
     * 错误 ,带数据, 自定义状态码
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(){
        return   setData(AxiosStatus.ERROR,null);
    }

    /**
     * 错误 , 自定义状态码
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return   setData(axiosStatus,null);
    }
    /**
     * 错误 ,  携带数据
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(T data ){
        return   setData(AxiosStatus.ERROR,data);
    }

    /**
     * 错误返回 携带数据
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data ){
        return   setData(axiosStatus,data);
    }
}
