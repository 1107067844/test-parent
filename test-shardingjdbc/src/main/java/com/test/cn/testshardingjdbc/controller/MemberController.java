package com.test.cn.testshardingjdbc.controller;

import com.test.cn.testshardingjdbc.dao.MemberMapper;
import com.test.cn.testshardingjdbc.entity.Member;
import com.test.cn.testshardingjdbc.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/member")
@RestController
public class MemberController {
    @Resource
    private MemberService memberService;

    /**
     * 新增
     * @return
     */
    @GetMapping("/insert")
    public String insert(){
        Member member=new Member();
        member.setMemberId(343L);
        member.setAge(2);
        member.setAccountNo("123");
        memberService.insert(member);
        return "success";
    }

    /**
     * 主键查询
     * @param id
     * @return
     */
    @GetMapping("/get")
    public Member get(long id){
        Member member= memberService.get(id);
        return  member;
    }

    /**
     * 修改
     * @param id
     * @return
     */
    @GetMapping("/update")
    public String update(long id){
        Member member= memberService.get(id);
        member.setDescription("分片表测试");
        memberService.update(member);
        return "success";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("/del")
    public String del(long id){
        memberService.del(id);
        return "success";
    }

}
