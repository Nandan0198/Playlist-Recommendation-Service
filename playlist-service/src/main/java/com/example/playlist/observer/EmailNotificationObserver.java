package com.example.playlist.observer;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationObserver implements PlaylistObserver {
    public void update(String msg) {
        System.out.println("Email: " + msg);
    }
}