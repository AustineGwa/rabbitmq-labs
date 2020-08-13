package com.gwaza.labs.rabbitmqlabs.rabbitmq.producer;

import com.gwaza.labs.rabbitmqlabs.config.ConfigureRabbitMq;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    private RabbitTemplate rabbitTemplate;

    public SendMessageController(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message){
        rabbitTemplate.convertAndSend(ConfigureRabbitMq.EXCHANGE_NAME, "gwaza.springmessages",message );
        return "we have sent a message :"+message;
    }
}
