package com.shajar.auth.controller.api;

import com.shajar.auth.data.dto.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MessagesController {


    @GetMapping("message")
    public Message getMessage(){
        Message myMessage=new Message();
        myMessage.setSender("shajar");
        myMessage.setReciever("Matar");
        myMessage.setSubject("Test");
        myMessage.setText("we have new message");
        return myMessage;
    }
}
