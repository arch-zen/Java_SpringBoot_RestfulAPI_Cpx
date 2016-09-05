package com.ymatou.mongocrudservice.SDK;

/**
 * Created by chenpengxuan on 2016/9/5.
 */
public class BaseResponseModel {
    /**
     * 系统编码 如500 404 301 200 等
     */
    public Integer Code;

    /**
     * 业务编码 定义业务检查边界场景
     * 如：用户不存在 1001 code与边界场景描述的映射关系需要用文档沉淀
     */
    public String BusinessCode;

    /**
     * 返回消息
     */
    public String Msg;

    /**
     * 操作是否成功
     */
    public boolean success;
}
