package com.test.cn.testshardingjdbc.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class PageHelperConfig {
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper=new PageHelper();
        return pageHelper;
    }
}
