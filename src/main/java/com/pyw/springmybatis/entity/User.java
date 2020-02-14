package com.pyw.springmybatis.entity;


import java.util.Date;

public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private String department;
    private String roleType;
    private Date create_time;
    private int status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    //    @Override
//    public String toString() {
//        return "{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", passWord='" + passWord + '\'' +
//                ", realName='" + realName + '\'' +
//                '}';
//    }
}
