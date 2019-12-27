package com.test.cn.testshardingjdbc.controller;

import com.github.pagehelper.PageInfo;
import com.test.cn.testshardingjdbc.dao.ConfigMapper;
import com.test.cn.testshardingjdbc.entity.Config;
import com.test.cn.testshardingjdbc.service.ConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/config")
@RestController
public class ConfigController {
    @Resource
    private ConfigService configService;

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/pageList")
    public PageInfo pageList(int pageNum,int pageSize){
      return   configService.pageList(pageNum,pageSize);
    }
    /**
     * 新增
     * @return
     */
    @GetMapping("/insert")
    public String insert(){
        Config config=new Config();
        config.setId(333);
        config.setConfig("测试广播表");
        config.setUserId(1L);
        configService.insert(config);
        return "sucess";
    }

    /**
     * 主键获取
     * @param id
     * @return
     */
    @GetMapping("/get")
    public Config get(long id){
       return configService.getById(id);
    }

    /**
     * 修改
     * @param id
     * @return
     */
    @GetMapping("/update")
    public String update(long id){
        Config config= configService.getById(id);
        config.setConfig("广播表修改");
        configService.update(config);
        return "success";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("/del")
    public String delete(long id){
        configService.del(id);
        return "success";
    }
}
