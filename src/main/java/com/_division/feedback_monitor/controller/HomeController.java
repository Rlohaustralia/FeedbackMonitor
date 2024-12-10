package com._division.feedback_monitor.controller;


import lombok.experimental.PackagePrivate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String index() {
        return "view/index";
    }

    @GetMapping("/login")
    public String login() {
        return "view/login";
    }

    @GetMapping("/about")
    public String about() {
        return "view/about";
    }

    @GetMapping("/mypage")
    public String mypage() {
        return "view/mypage/mypage";
    }

    @GetMapping("/mypage/settings")
    public String memberDetails() {
        return "view/mypage/settings";
    }

    @GetMapping("/mypage/savedFeedbacks")
    public String savedFeedbacks() {
        return "view/mypage/savedFeedbacks";
    }

    @GetMapping("/mypage/keywords")
    public String keywords() {
        return "view/mypage/keywords";
    }

}