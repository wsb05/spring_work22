package com.dgsw.studyjpa.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AA {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    private String aa;
    private String bb;


    private LocalDateTime cdate;
    private LocalDateTime mdate;


    private int count;
}
