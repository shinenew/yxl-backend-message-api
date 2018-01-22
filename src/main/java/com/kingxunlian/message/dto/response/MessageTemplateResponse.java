package com.kingxunlian.message.dto.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/22 下午3:09
 */
public class MessageTemplateResponse implements Serializable{
    /**
     * 消息模版ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long templateId;

    /**
     * 模版编码
     */
    private String templateCode;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 模版内容，不能超过200个字符
     */
    private String templateContext;

    /**
     * 模块跳转地址
     */
    private String templateUrl;

    /**
     * 模板所属系统
     */
    private String templateApp;

    /**
     * 模版是否启用
     */
    private Byte templateEnable;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Long getTemplateId() {
        return templateId;
    }

    public MessageTemplateResponse setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public MessageTemplateResponse setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public MessageTemplateResponse setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateContext() {
        return templateContext;
    }

    public MessageTemplateResponse setTemplateContext(String templateContext) {
        this.templateContext = templateContext;
        return this;
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    public MessageTemplateResponse setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }

    public String getTemplateApp() {
        return templateApp;
    }

    public MessageTemplateResponse setTemplateApp(String templateApp) {
        this.templateApp = templateApp;
        return this;
    }

    public Byte getTemplateEnable() {
        return templateEnable;
    }

    public MessageTemplateResponse setTemplateEnable(Byte templateEnable) {
        this.templateEnable = templateEnable;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public MessageTemplateResponse setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public MessageTemplateResponse setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
