package com.ymatou.mongocrudservice.SDK;

/**
 * SDK 请求响应基本模型
 * Created by chenpengxuan on 2016/9/5.
 */
public abstract class BaseRequestModel<T extends BaseResponseModel>  {
    /**
     * 所有子类必须对参数进行边界检查
     */
   public abstract void Validate() throws ApiException;
}
