package com.kingxunlian.message.dto.response;

import com.kingxunlian.message.dto.enums.MessageStateEnum;
import com.kingxunlian.message.dto.enums.MessageTypeEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午6:06
 */
public class MessageSendResponse implements Serializable {

    /**
     * 消息唯一ID
     */
    private Long messageId;

    /**
     * 发送者ID
     */
    private UUID sendUser;

    /**
     * 接受用户ID
     */
    private UUID receiveUser;

    /**
     * 消息状态：0-未读，1-已读
     */
    private MessageStateEnum messageState;

    /**
     * 消息是否已经删除
     */
    private Integer isDelete;

    /**
     * 消息内容，不能为空
     */
    private String messageContent;

    /**
     * 消息发送时间
     */
    private Date postDate;

    /**
     * 消息标题
     */
    private String messageTitle;

    /**
     * 消息创建人
     */
    private String creatorId;

    /**
     * 消息类型
     */
    private MessageTypeEnum messageType;

    /**
     * 消息所属系统
     */
    private String messageSystem;

    /**
     * 消息跳转的地址
     */
    private String messageUrl;

    /**
     * 消息扩展字段
     */
    private String messageExtra;

    /**
     * 消息创建时间
     */
    private Date createTime;

    /**
     * 消息更新时间
     */
    private Date updateTime;


    public Long getMessageId() {
        return messageId;
    }

    public MessageSendResponse setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    public UUID getSendUser() {
        return sendUser;
    }

    public MessageSendResponse setSendUser(UUID sendUser) {
        this.sendUser = sendUser;
        return this;
    }

    public UUID getReceiveUser() {
        return receiveUser;
    }

    public MessageSendResponse setReceiveUser(UUID receiveUser) {
        this.receiveUser = receiveUser;
        return this;
    }

    public MessageStateEnum getMessageState() {
        return messageState;
    }

    public MessageSendResponse setMessageState(MessageStateEnum messageState) {
        this.messageState = messageState;
        return this;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public MessageSendResponse setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public MessageSendResponse setMessageContent(String messageContent) {
        this.messageContent = messageContent;
        return this;
    }

    public Date getPostDate() {
        return postDate;
    }

    public MessageSendResponse setPostDate(Date postDate) {
        this.postDate = postDate;
        return this;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public MessageSendResponse setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
        return this;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public MessageSendResponse setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public MessageSendResponse setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    public String getMessageSystem() {
        return messageSystem;
    }

    public MessageSendResponse setMessageSystem(String messageSystem) {
        this.messageSystem = messageSystem;
        return this;
    }

    public String getMessageUrl() {
        return messageUrl;
    }

    public MessageSendResponse setMessageUrl(String messageUrl) {
        this.messageUrl = messageUrl;
        return this;
    }

    public String getMessageExtra() {
        return messageExtra;
    }

    public MessageSendResponse setMessageExtra(String messageExtra) {
        this.messageExtra = messageExtra;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public MessageSendResponse setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public MessageSendResponse setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
