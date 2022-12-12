package com.example.week2;

public class Products {
    private Integer image;
    private String model;
    private double price;


    public Products(Integer image, String model, double price) {
        this.image = image;
        this.model = model;
        this.price = price;
    }


    public Integer getImage() {
        return image;
    }
    public void setImage(Integer image) {
        this.image = image;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
