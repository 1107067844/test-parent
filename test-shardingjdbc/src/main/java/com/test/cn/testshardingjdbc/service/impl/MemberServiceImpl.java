package com.test.cn.testshardingjdbc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.cn.testshardingjdbc.dao.MemberMapper;
import com.test.cn.testshardingjdbc.entity.Config;
import com.test.cn.testshardingjdbc.entity.Member;
import com.test.cn.testshardingjdbc.service.MemberService;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    /**
     * 新增
     * @param member
     */
    public void insert(Member member) {
        memberMapper.insert(member);
    }

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<Member> pageList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Member> list=memberMapper.selectAll();
        PageInfo<Member> pageInfo=new PageInfo<Member>(list);
        return pageInfo;
    }

    /**
     * 主键获取
     * @param id
     * @return
     */
    public Member get(long id) {
        return memberMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改
     * @param member
     * @return
     */
    @Transactional
    @ShardingTransactionType(value =TransactionType.XA )
    public int update(Member member) {
        memberMapper.updateByPrimaryKey(member);
        return 0;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Transactional
    @ShardingTransactionType(value =TransactionType.XA )
    public int del(long id) {
        memberMapper.deleteByPrimaryKey(id);
        return 0;
    }
}
