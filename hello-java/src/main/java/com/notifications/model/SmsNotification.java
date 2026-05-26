package com.notifications.model;

public class SmsNotification implements Notification {
    private String phoneNumber;

    public SmsNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("[SMS] " + phoneNumber);
    }
}