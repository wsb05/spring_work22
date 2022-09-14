package com.example.dgsw.controller;

import com.example.dgsw.components.ACompo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    ACompo aCompo;

    @GetMapping("")
    public String index(){
        aCompo.doA();
        return "main";
    }

}
