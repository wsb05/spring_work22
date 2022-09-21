package com.dgsw.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {
    // select 해서 테이블 내용 뿌려주는거
    @GetMapping("findall")
    public String findall(Model model){
        System.out.println("findall");

        model.addAttribute("a", "10");

        return "findall";
    }
    //insert 해서 테이블에 행 삽입
    @GetMapping("insert")
    public String insert(){
        return "insert";
    }
}
