package com.makofon.chatstructure.client;

import com.makofon.chatstructure.protocol.MessageProtocol;

public class MessageCl {

    private String body;

    public MessageCl(String body, MessageProtocol.MessageType type) {
        this.body = body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
