package com.kingxunlian.message.client;

import com.kingxunlian.message.dto.request.MessageSendRequest;
import javafx.application.Application;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Descriptions:
 * @Author: chenliang@tsfinance.com
 * @Date: create in 2018/1/16 下午2:49
 */

@RequestMapping({"/message"})
@FeignClient(name = "message-service", serviceId = "message-service")
public interface IMessageServiceClient {

    @RequestMapping(value = "/send",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    MessageSendRequest sendMessage(MessageSendRequest messageSendRequest);


}
