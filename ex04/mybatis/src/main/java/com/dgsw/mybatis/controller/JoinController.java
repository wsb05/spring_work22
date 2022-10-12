package com.dgsw.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class JoinController {

    @GetMapping("main")
    public String main(){
        return "join/main";
    }

}
