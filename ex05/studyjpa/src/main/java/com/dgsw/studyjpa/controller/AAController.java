package com.dgsw.studyjpa.controller;

import com.dgsw.studyjpa.entity.AA;
import com.dgsw.studyjpa.repository.AARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aa")
public class AAController {

    @Autowired
    AARepository aaRepository;

    @GetMapping("save")
    public String save(){
        System.out.println("save");

        aaRepository.save(new AA());

        return "save";
    }

}
