package com.example.knowsaudi.Models;

public class AdminsModel {
    String name;
    String location;
    private int image;


    public AdminsModel(String name, String location, int image) {
        this.name = name;
        this.location = location;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    public int getInamge() {
        return image;
    }

    public void setInamge(int inamge) {
        this.image = inamge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
