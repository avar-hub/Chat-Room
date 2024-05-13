package com.chatRoom.ChatRoom.controller;

import com.chatRoom.ChatRoom.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(Message message){

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException exception){
            exception.printStackTrace();
        }
        return message;
    }
}
