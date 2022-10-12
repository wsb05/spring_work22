package com.dgsw.mybatis.controller;

import com.dgsw.mybatis.dto.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("board")
public class BoardController {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    // select 해서 테이블 내용 뿌려주는거
    @GetMapping("findall")
    public String findall(Model model){
        System.out.println("findall");

        List<Test> testlist = sqlSessionTemplate.selectList("test.findall");

        model.addAttribute("a","10");
        model.addAttribute("testlist", testlist);

        return "findall";
    }
    //insert 해서 테이블에 행 삽입
    @GetMapping("insert")
    public String insert(Test test){
        return "insert";
    }

    @PostMapping("insert")
    public String pinsert(@Valid Test test, BindingResult bindingResult, Model model){
//        System.out.println(aa);
//        System.out.println(bb);
        // single quota '
        if( bindingResult.hasErrors()){
            System.out.println("에러 있음");
//            model.addAttribute("error",true);
            return "insert";
        }

        System.out.println(test);
        sqlSessionTemplate.insert("test.inserttest", test);

        return "redirect:/board/findall";
    }

    @GetMapping("update")
    public String update(int idx, Test test, Model model){
        System.out.println("idx = "+idx);
        test = sqlSessionTemplate.selectOne("test.findbyidx", idx);
        System.out.println(test);
        model.addAttribute("test",test);
        return "insert";
    }

    @PostMapping("update")
    public String pupdate(Test test){
        sqlSessionTemplate.update("test.updatetest",test);
        return "redirect:/board/findall";
    }

    // 추가 : 글 삭제 처리
    @PostMapping("delete")
    public String delete(@RequestParam(required = false) List<Integer> check) {
        check.forEach(idx -> sqlSessionTemplate.delete("test.delete", idx));

        return "redirect:/board/findall";
    }

}