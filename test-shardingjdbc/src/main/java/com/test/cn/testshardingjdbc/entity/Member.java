package com.test.cn.testshardingjdbc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_member")
public class Member implements Serializable {
    @Id
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private Integer age;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "ebl_flag")
    private String eblFlag;

    @Column(name = "del_flag")
    private String delFlag;

    @Column(name = "description")
    private String description;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return member_name
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * @return account_no
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return birth_date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return ebl_flag
     */
    public String getEblFlag() {
        return eblFlag;
    }

    /**
     * @param eblFlag
     */
    public void setEblFlag(String eblFlag) {
        this.eblFlag = eblFlag == null ? null : eblFlag.trim();
    }

    /**
     * @return del_flag
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}