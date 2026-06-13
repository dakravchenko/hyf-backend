package com.week1and2.notifications.model;

public class PushNotification implements Notification {
    private String deviceToken;

    public PushNotification(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    @Override
    public void send() {
        System.out.println("[PUSH] " + deviceToken);
    }
}