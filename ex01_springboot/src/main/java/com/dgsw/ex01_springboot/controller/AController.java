package com.dgsw.ex01_springboot.controller;

import com.dgsw.ex01_springboot.components.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
public class AController {

    @Autowired
    A a1;

    @Autowired
    A a2;

    @Autowired
    DataSource ds;

    @GetMapping("aa")
    public String aa(){
        A a3 = new A();

        System.out.println("a1 = "+a1);
        System.out.println("a2 = "+a2);
        System.out.println("a3 = "+a3);

        return "aa";
    }

    @GetMapping("tablecreate")
    @ResponseBody
    public String tablecreate(){
        Connection conn = null;
        try{
            conn = ds.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                    "create table test ( aa varchar(20), bb varchar(20) )");
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return "tablecreate";
    }

}
