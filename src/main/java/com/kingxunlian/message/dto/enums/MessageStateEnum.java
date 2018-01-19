package com.kingxunlian.message.dto.enums;

import com.kingxunlian.common.IntEnum;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/17 下午5:02
 */
public enum MessageStateEnum implements IntEnum<MessageStateEnum>{

    UNREAD(0,"未读"),
    READ(1,"已读"),
    INVALID(2,"失效");


    MessageStateEnum(final Integer index,final String name){
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
