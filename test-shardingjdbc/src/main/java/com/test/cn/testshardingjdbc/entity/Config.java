package com.test.cn.testshardingjdbc.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_config")
public class Config implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "config")
    private String config;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return config;
    }

    /**
     * @param config
     */
    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}