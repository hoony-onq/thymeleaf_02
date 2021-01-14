package com.test.thymeleaf_02.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class Board_Controller {

    @GetMapping("/list")
    public String list() {
        return "board/list";
    }
}