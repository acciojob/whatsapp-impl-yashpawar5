package com.driver;

import java.util.Date;

public class Message {

    private int id;

    public Message(int messageId, String content) {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    private Date timestamp;
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }



}
