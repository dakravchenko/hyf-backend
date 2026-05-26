package com.notifications;

import com.notifications.model.Notification;

public class NotificationSender {
    public void send(Notification notification) {
        notification.send();
    }
}