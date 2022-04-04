package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class Bill implements Serializable {
    /**
    * 账单id
    */
    private Integer id;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 消费时间
    */
    private Date time;

    /**
    * 菜品评价
    */
    private String report;

    /**
    * 菜品名
    */
    private String foods;

    /**
    * 金额
    */
    private Double money;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}