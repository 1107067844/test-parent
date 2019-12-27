package com.test.cn.testshardingjdbc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/")
    public Object sayHello() {
        return "test hello!";
    }
}
