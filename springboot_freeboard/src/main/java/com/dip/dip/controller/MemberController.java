package com.dip.dip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("members")
public class MemberController {

    @GetMapping("login")
    public String login(){
        return "members/login";
    }

    @GetMapping("signup")
    public String singup(){
        return "members/signup";
    }

    @PostMapping("signup")
    public String psignup(){
        System.out.println("일로오나");
        System.out.println(member);

        member.setPassword

        return "redirect:/";
    }

}
