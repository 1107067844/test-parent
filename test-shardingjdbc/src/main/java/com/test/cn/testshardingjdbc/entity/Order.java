package com.test.cn.testshardingjdbc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order0")
public class Order implements Serializable {
    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "order_code")
    private String orderCode;

    @Column(name = "order_amount")
    private String orderAmount;

    @Column(name = "status")
    private String status;

    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * @return member_id
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * @return order_code
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * @param orderCode
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * @return order_amount
     */
    public String getOrderAmount() {
        return orderAmount;
    }

    /**
     * @param orderAmount
     */
    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount == null ? null : orderAmount.trim();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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