package com.dgsw.studyjpa.controller;

import com.dgsw.studyjpa.entity.FreeBoard;
import com.dgsw.studyjpa.repository.FreeBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("board")
@RestController
public class FreeBoardController {

    @Autowired
    FreeBoardRepository freeBoardRepository;

    @GetMapping
    public List<FreeBoard> list(){
        List<FreeBoard> list = freeBoardRepository.findAll();
        return null;
    }
    @PostMapping("write")
    public String write(){
        return "write";
    }
    @PostMapping("update")
    public String update(){
        return "update";
    }
    @PostMapping("delete")
    public String delete(){
        return "delete";
    }

}
