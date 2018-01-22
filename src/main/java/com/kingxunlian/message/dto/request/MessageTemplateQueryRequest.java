package com.kingxunlian.message.dto.request;


import java.io.Serializable;
import java.util.Date;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/22 下午3:23
 */
public class MessageTemplateQueryRequest implements Serializable {

    /**
     * 消息模版ID
     */
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

    public MessageTemplateQueryRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public MessageTemplateQueryRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public MessageTemplateQueryRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateContext() {
        return templateContext;
    }

    public MessageTemplateQueryRequest setTemplateContext(String templateContext) {
        this.templateContext = templateContext;
        return this;
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    public MessageTemplateQueryRequest setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }

    public String getTemplateApp() {
        return templateApp;
    }

    public MessageTemplateQueryRequest setTemplateApp(String templateApp) {
        this.templateApp = templateApp;
        return this;
    }

    public Byte getTemplateEnable() {
        return templateEnable;
    }

    public MessageTemplateQueryRequest setTemplateEnable(Byte templateEnable) {
        this.templateEnable = templateEnable;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public MessageTemplateQueryRequest setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public MessageTemplateQueryRequest setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
