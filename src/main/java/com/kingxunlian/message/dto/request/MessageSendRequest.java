package com.kingxunlian.message.dto.request;

import com.kingxunlian.message.dto.enums.MessageTypeEnum;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午6:06
 */
public class MessageSendRequest implements Serializable{

    /**
     * 调用的系统编码
     */
    @NotNull(message = "系统代码不能为空")
    @Size(max = 36)
    private String appCode;

    /**
     * 发送者ID
     */
    private UUID sendUser;

    /**
     * 接受消息的用户，如果是全员接受则为空
     */
    private List<UUID> receiveUserList;

    /**
     * 消息类型
     */
    @NotNull(message = "消息类型不能为空")
    private MessageTypeEnum messageType;

    /**
     * 消息模版编码
     */
    @NotNull(message = "消息模版编码不能为空")
    private String messageTemplate;

    /**
     * 消息的参数
     */
    private String messageParameter;

    /**
     * 消息内容，不能为空
     */
    private String messageContent;

    /**
     * 消息扩展字段
     * 需要操作的消息：接受，拒绝等
     */
    private String messageExtra;


    public String getAppCode() {
        return appCode;
    }

    public MessageSendRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }

    public UUID getSendUser() {
        return sendUser;
    }

    public MessageSendRequest setSendUser(UUID sendUser) {
        this.sendUser = sendUser;
        return this;
    }

    public List<UUID> getReceiveUserList() {
        return receiveUserList;
    }

    public MessageSendRequest setReceiveUserList(List<UUID> receiveUserList) {
        this.receiveUserList = receiveUserList;
        return this;
    }

    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public MessageSendRequest setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    public String getMessageTemplate() {
        return messageTemplate;
    }

    public MessageSendRequest setMessageTemplate(String messageTemplate) {
        this.messageTemplate = messageTemplate;
        return this;
    }

    public String getMessageParameter() {
        return messageParameter;
    }

    public MessageSendRequest setMessageParameter(String messageParameter) {
        this.messageParameter = messageParameter;
        return this;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public MessageSendRequest setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }

    public String getMessageExtra() {
        return messageExtra;
    }

    public MessageSendRequest setMessageExtra(String messageExtra) {
        this.messageExtra = messageExtra;
        return this;
    }
}
