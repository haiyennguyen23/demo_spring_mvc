package model;

import java.util.StringJoiner;

public class Product {
 private int id;
 private String name;
 private String img;
 private  Double price;
 private boolean status;
    public Product() {
    }

    public Product(int id, String name, String img, Double price, boolean status) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.status=status;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setDescription(Double price ) {
        this.price = price;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
