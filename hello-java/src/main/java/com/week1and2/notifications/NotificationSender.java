package com.week1and2.notifications;

import com.week1and2.notifications.model.Notification;

public class NotificationSender {
    public void send(Notification notification) {
        notification.send();
    }
}