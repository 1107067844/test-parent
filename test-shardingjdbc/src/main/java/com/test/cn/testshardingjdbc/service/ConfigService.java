package com.test.cn.testshardingjdbc.service;

import com.github.pagehelper.PageInfo;
import com.test.cn.testshardingjdbc.entity.Config;

import java.util.List;

public interface ConfigService {
    PageInfo<Config> pageList(int pageNum, int pageSize);
    void insert(Config config);
    Config getById(long id);
    int update(Config config);
    int del(long id);
}
