package com.example.playlist.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RateLimitService {

    private Map<String, Integer> requests = new HashMap<>();
    private final int LIMIT = 5;

    public boolean allow(String user) {
        requests.put(user, requests.getOrDefault(user, 0) + 1);
        return requests.get(user) <= LIMIT;
    }
}