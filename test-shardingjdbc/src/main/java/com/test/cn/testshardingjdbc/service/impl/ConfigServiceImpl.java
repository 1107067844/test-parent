package com.test.cn.testshardingjdbc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.cn.testshardingjdbc.dao.ConfigMapper;
import com.test.cn.testshardingjdbc.entity.Config;
import com.test.cn.testshardingjdbc.service.ConfigService;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公共表
 */
@Service
public class ConfigServiceImpl implements ConfigService {
    @Resource
    private ConfigMapper configMapper;

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<Config> pageList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Config> list=configMapper.selectAll();
        PageInfo<Config> pageInfo=new PageInfo<Config>(list);
        return pageInfo;
    }

    /**
     * 分布式事务
     * @param config
     */
    @Transactional
    @ShardingTransactionType(value =TransactionType.XA )
    public void insert(Config config) {
        config.setId(444);
        config.setConfig("测试广播表");
        config.setUserId(1L);
        configMapper.insert(config);
    }

    /**
     * 主键获取
     * @param id
     * @return
     */
    public Config getById(long id){
      return   configMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改
     * @param config
     * @return
     */
    @Transactional
    @ShardingTransactionType(value =TransactionType.XA )
    public int update(Config config) {
       return configMapper.updateByPrimaryKey(config);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Transactional
    @ShardingTransactionType(value =TransactionType.XA )
    public int del(long id) {
        return configMapper.deleteByPrimaryKey(id);
    }

}
