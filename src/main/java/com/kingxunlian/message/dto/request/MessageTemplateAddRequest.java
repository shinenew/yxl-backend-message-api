package com.kingxunlian.message.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/22 下午3:12
 */
public class MessageTemplateAddRequest implements Serializable{

    /**
     * 模版编码
     */
    @NotNull(message = "模版编码不能为空")
    @Size(max = 36)
    private String templateCode;

    /**
     * 模板名称
     */
    @NotNull(message = "模板名称不能为空")
    @Size(max = 36)
    private String templateName;

    /**
     * 模版内容，不能超过200个字符
     */
    @NotNull(message = "模版内容不能为空")
    @Size(max = 200)
    private String templateContext;

    /**
     * 模块跳转地址
     */
    @NotNull(message = "模块跳转地址不能为空")
    @Size(max = 128)
    private String templateUrl;

    /**
     * 模板所属系统
     */
    @NotNull(message = "模板所属系统不能为空")
    @Size(max = 36)
    private String templateApp;

    public String getTemplateCode() {
        return templateCode;
    }

    public MessageTemplateAddRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public MessageTemplateAddRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateContext() {
        return templateContext;
    }

    public MessageTemplateAddRequest setTemplateContext(String templateContext) {
        this.templateContext = templateContext;
        return this;
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    public MessageTemplateAddRequest setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
        return this;
    }

    public String getTemplateApp() {
        return templateApp;
    }

    public MessageTemplateAddRequest setTemplateApp(String templateApp) {
        this.templateApp = templateApp;
        return this;
    }
}
