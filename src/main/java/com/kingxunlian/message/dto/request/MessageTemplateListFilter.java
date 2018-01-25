package com.kingxunlian.message.dto.request;

import java.io.Serializable;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/25 下午2:42
 */
public class MessageTemplateListFilter  implements Serializable{

    private Integer pageNum;

    private Integer pageSize;
    /**
     * 模版是否启用
     */
    private Byte templateEnable;

    /**
     * 模版编码
     */
    private String fuzzyTemplateCode;

    /**
     * 消息模版ID
     */
    private Long templateId;

    public Integer getPageNum() {
        return pageNum;
    }

    public MessageTemplateListFilter setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public MessageTemplateListFilter setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Byte getTemplateEnable() {
        return templateEnable;
    }

    public MessageTemplateListFilter setTemplateEnable(Byte templateEnable) {
        this.templateEnable = templateEnable;
        return this;
    }


    public String getFuzzyTemplateCode() {
        return fuzzyTemplateCode;
    }

    public MessageTemplateListFilter setFuzzyTemplateCode(String fuzzyTemplateCode) {
        this.fuzzyTemplateCode = fuzzyTemplateCode;
        return this;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public MessageTemplateListFilter setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
}
