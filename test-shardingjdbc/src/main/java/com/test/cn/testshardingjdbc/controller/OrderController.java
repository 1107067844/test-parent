package com.test.cn.testshardingjdbc.controller;

import com.test.cn.testshardingjdbc.dao.OrderMapper;
import com.test.cn.testshardingjdbc.entity.Member;
import com.test.cn.testshardingjdbc.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RequestMapping("/order")
@RestController
public class OrderController {
    @Resource
    private OrderMapper orderMapper;

    @GetMapping("/insert")
    public String insert(){
        Order order=new Order();
        order.setOrderId(1L);
        order.setMemberId("1");
        order.setOrderCode("654321");
        order.setOrderAmount("123456");
        order.setStatus("1");
    //    order.setCreateTime(new Date());
        orderMapper.insert(order);
        return "success";
    }
}
