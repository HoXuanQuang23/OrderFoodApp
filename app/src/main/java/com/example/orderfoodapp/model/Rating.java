package com.example.orderfoodapp.model;

import java.util.Date;

public class Rating {
    private String idUser, idFood;
    private Date date;
    private Integer rate;

    public Rating(String idUser, String idFood, Date date, Integer rate) {
        this.idUser = idUser;
        this.idFood = idFood;
        this.date = date;
        this.rate = rate;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdFood() {
        return idFood;
    }

    public void setIdFood(String idFood) {
        this.idFood = idFood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
