package com.makofon.chatstructure.client;

//Class which implements structure of message
public class MessageCl {

    private String body;

    public MessageCl(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    //method should be used for message editing [
    public void setBody(String body) {
        this.body = body;
    }
}
