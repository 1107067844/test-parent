package com.test.cn.testshardingjdbc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan("com.test.cn.testshardingjdbc.dao")
@ComponentScan("com.test.cn.testshardingjdbc")
@EnableTransactionManagement
@SpringBootApplication
public class TestShardingjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestShardingjdbcApplication.class, args);
    }

}
