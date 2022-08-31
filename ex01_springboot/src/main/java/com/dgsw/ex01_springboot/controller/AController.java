package com.dgsw.ex01_springboot.controller;

import com.dgsw.ex01_springboot.components.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {

    @Autowired
    A a1;

    @Autowired
    A a2;

    @GetMapping("aa")
    public String aa(){
        A a3 = new A();

        System.out.println("a1 = "+a1);
        System.out.println("a2 = "+a2);
        System.out.println("a3 = "+a3);

        return "aa";
    }

}
