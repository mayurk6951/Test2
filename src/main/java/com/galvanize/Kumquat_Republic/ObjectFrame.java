package com.galvanize.Kumquat_Republic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity()

public class ObjectFrame {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String category;
    private String brand;
    private String color;
    private Double price;

    public ObjectFrame(long id, String category, String brand, String color, Double price) {
        this.id = id;
        this.category = category;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public ObjectFrame() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

