package com.jg.mes.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: JG.Yu
 * @Date: 2021/1/5 0005 - 01 - 05 - 下午 7:23
 * @Description: com.jg.mes.domain
 * @version: 1.0
 */
public class User implements Serializable {
    @JsonIgnore
   private int id;
   private String name;
   private String pwd;
   @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
   private Date creatDate;

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
        this.creatDate=new Date();
    }

    public User(int id, String name, String pwd, Date creatDate) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", creatDate=" + creatDate +
                '}';
    }
}
