package com.test.thymeleaf_02.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home_Controller {

    @GetMapping
    public String home() {
        return "home";
    }
}