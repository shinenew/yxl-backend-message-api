package com.kingxunlian.message.dto.enums;

import com.kingxunlian.common.IntEnum;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午5:08
 */
public enum MessageTypeEnum implements IntEnum<MessageTypeEnum> {

    SYSTEM(0,"系统消息"),
    NOTICE(1,"通知提醒"),
    INNER(2,"站内信"),
    TODO(3,"待办");


    MessageTypeEnum(final Integer index,final String name){
        this.index = index;
        this.name = name;
    }


    private final int index;
    private final String name;

    @Override
    public Integer getIntValue() {
        return this.index;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
