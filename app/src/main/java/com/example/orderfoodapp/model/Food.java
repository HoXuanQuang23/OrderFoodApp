package com.example.orderfoodapp.model;

public class Food {
   private String id, idFoodType, name, img;
   private Double price;

    public Food(String id, String idFoodType, String name, String img, Double price) {
        this.id = id;
        this.idFoodType = idFoodType;
        this.name = name;
        this.img = img;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdFoodType() {
        return idFoodType;
    }

    public void setIdFoodType(String idFoodType) {
        this.idFoodType = idFoodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
