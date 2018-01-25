package com.kingxunlian.message.exception;

import com.kingxunlian.exception.XLError;
import com.kingxunlian.exception.XLServiceCodeEnum;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/19 下午3:15
 */
public enum MessageErrorCodeEnum implements XLError{
    SERVER_INNER_ERROR("11001", "Message server inner error", "消息系统服务器内部错误", XLServiceCodeEnum.MESSAGE_SERVICE),
    TEMPLATE_NOT_FOUND("11002", "Message template not found", "消息模版不存在", XLServiceCodeEnum.MESSAGE_SERVICE),
    MESSAGE_NOT_FOUND("11005", "Message  not found", "消息不存在", XLServiceCodeEnum.MESSAGE_SERVICE),
    TEMPLATE_RENDER_FAILED("11004", "Message template render failed", "消息模版渲染失败", XLServiceCodeEnum.MESSAGE_SERVICE),
    TEMPLATE_IS_DISABLED("11003", "Message template is disabled", "消息模版已禁用", XLServiceCodeEnum.MESSAGE_SERVICE);


    private String errorCode;
    private String errorMsg;
    private Object description;
    private XLServiceCodeEnum serviceCode;

    private MessageErrorCodeEnum(String errorCode, String errorMsg, String description, XLServiceCodeEnum serviceCode) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.description = description;
        this.serviceCode = serviceCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Object getDescription() {
        return this.description;
    }

    public String getServiceCode() {
        return this.serviceCode.getServiceName();
    }

    public void setErrorMsg(Object msg) {
        this.description = msg;
    }

}
