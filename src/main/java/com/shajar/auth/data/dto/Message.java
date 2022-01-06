package com.shajar.auth.data.dto;

import lombok.Data;

@Data
public class Message {
    private String sender;
    private String reciever;
    private String subject;
    private String text;

}
