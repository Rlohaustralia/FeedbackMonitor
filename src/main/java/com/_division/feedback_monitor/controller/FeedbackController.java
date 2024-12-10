package com._division.feedback_monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @GetMapping
    public String getAllFeedbacks() {
        return "view/feedback";
    }


}
