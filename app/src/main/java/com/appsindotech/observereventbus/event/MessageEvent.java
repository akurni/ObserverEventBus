package com.appsindotech.observereventbus.event;

/**
 * Created by andrewkurniadi on 1/15/16.
 */
public class MessageEvent {
    String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
