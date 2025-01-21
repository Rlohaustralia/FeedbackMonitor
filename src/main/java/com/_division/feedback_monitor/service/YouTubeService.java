package com._division.feedback_monitor.service;

import com.google.api.client.util.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


@Service
public class YouTubeService {

    @Value("${youtube.api.key}")
    private String apiKey;


}
