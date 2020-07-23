package com.example.knowsaudi.Models;

public class PendingOfferModel {

    String name;
    String language;



    String yearexperience;
    String price;
    String car;

    public PendingOfferModel(String name, String language, String yearexperience, String price, String car, int imagecancel, int imagecheck,int img) {
        this.name = name;
        this.language = language;
        this.yearexperience = yearexperience;
        this.price = price;
        this.car = car;
        this.imagecancel = imagecancel;
        this.imagecheck = imagecheck;
        this.img=img;
    }

    public void setImagecancel(int imagecancel) {
        this.imagecancel = imagecancel;
    }

    public void setImagecheck(int imagecheck) {
        this.imagecheck = imagecheck;
    }

    public int getImagecancel() {
        return imagecancel;
    }

    public int getImagecheck() {
        return imagecheck;
    }

    public int getImage() {
        return img;
    }


    private int imagecancel,imagecheck,img;


    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setYearexperience(String yearexperience) {
        this.yearexperience = yearexperience;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getYearexperience() {
        return yearexperience;
    }

    public String getPrice() {
        return price;
    }

    public String getCar() {
        return car;
    }
}
