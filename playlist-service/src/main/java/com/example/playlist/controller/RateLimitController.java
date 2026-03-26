package com.example.playlist.controller;

import com.example.playlist.model.ApiResponse;
import com.example.playlist.service.RateLimitService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rate")
public class RateLimitController {

    private final RateLimitService service;

    public RateLimitController(RateLimitService s) {
        this.service = s;
    }

    @GetMapping
    public ApiResponse<String> check(@RequestParam String user) {
        if (!service.allow(user)) {
            return ApiResponse.error("Rate limit exceeded");
        }
        return ApiResponse.success("Allowed");
    }
}