package com.test.cn.testshardingjdbc.service;

import com.github.pagehelper.PageInfo;
import com.test.cn.testshardingjdbc.entity.Member;

public interface MemberService {
    void insert(Member member);
    PageInfo<Member> pageList(int pageNum,int pageSize);
    Member get(long id);
    int update(Member member);
    int del(long id);
}
