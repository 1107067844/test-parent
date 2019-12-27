package com.test.cn.testshardingjdbc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Object defaultExceptionHandler(HttpServletRequest req, Exception e){
            e.printStackTrace();
            return "我是个异常类";
    }
}
