package com.gwaza.labs.rabbitmqlabs.rabbitmq.consumer;

import org.springframework.stereotype.Service;

@Service
public class RecieveMessageHandler {

    public void handleMessage(String messageBody){
        System.out.println("Handle message \n "+ messageBody + "\n the end");
    }
}
