package com.dgsw.ex01_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BController {

    @GetMapping("bb")
    public String bb() {
        return "bb";
    }

}
