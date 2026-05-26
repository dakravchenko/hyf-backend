package com.notifications.model;

public class EmailNotification implements Notification {
    private String recipient;

    public EmailNotification(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public void send() {
        System.out.println("[EMAIL] " + recipient);
    }
}