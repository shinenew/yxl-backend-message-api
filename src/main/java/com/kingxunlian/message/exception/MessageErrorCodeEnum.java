package com.kingxunlian.message.exception;

import com.kingxunlian.exception.XLError;
import com.kingxunlian.exception.XLServiceCodeEnum;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/19 下午3:15
 */
public enum MessageErrorCodeEnum implements XLError{
    SERVER_INNER_ERROR("11001", "Message server inner error", "消息系统服务器内部错误", XLServiceCodeEnum.MESSAGE_SERVICE);

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
