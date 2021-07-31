package com.chunbin.jenkinstest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app-api")
public class TestController {
    @Value("${aa.bb.cc:5M}")
    private String  maxFileSize;

    @GetMapping("/qryUser")
    public String qryUser(){
        return "chunbin";
    }
}
