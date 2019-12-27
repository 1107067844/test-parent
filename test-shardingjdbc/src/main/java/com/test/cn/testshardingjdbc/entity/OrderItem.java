package com.test.cn.testshardingjdbc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order_item")
public class OrderItem implements Serializable {
    @Id
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "item_account")
    private Double itemAccount;

    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return item_id
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * @return order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * @return product_name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * @return item_account
     */
    public Double getItemAccount() {
        return itemAccount;
    }

    /**
     * @param itemAccount
     */
    public void setItemAccount(Double itemAccount) {
        this.itemAccount = itemAccount;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}