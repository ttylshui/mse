package com.jg.mes.domain;

import java.util.Date;

/**
 * @author: JG.Yu
 * @Date: 2021/1/5 0005 - 01 - 05 - 下午 7:23
 * @Description: com.jg.mes.domain
 * @version: 1.0
 */
public class User {
   private String name;
   private String pwd;
   private Date creatDate;

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public User(String name, String pwd, Date creatDate) {
        this.name = name;
        this.pwd = pwd;
        this.creatDate = creatDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", creatDate=" + creatDate +
                '}';
    }
}
