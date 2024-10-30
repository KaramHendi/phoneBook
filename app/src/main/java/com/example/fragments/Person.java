package com.example.fragments;

public class Person {
    String name;
    String phone;
    int imageView;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Person(String name,String phone,int imageView){
        this.name = name;
        this.phone = phone;
        this.imageView=imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getImageView() {
        return imageView;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
