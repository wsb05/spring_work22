package com.dgsw.ex01_springboot.AController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {

    @GetMapping("aa")
    public String aa(){
        return "aa";
    }

}
