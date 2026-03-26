package com.example.playlist.observer;

import org.springframework.stereotype.Component;

@Component
public class PushNotificationObserver implements PlaylistObserver {
    public void update(String msg) {
        System.out.println("Push: " + msg);
    }
}