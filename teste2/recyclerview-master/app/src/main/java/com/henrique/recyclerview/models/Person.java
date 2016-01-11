package com.henrique.recyclerview.models;


public class Person {
    private int id;
    private String name;
    private String lastName;
    private String avatar;

    public Person(int id, String name, String lastName, String avatar){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.avatar = avatar;
    }

    public int getId() {return id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAge(String avatar) {
        this.avatar = avatar;
    }

    public void incrementViewCount(int id) {}

    public void resetViewCount(int id) {}

    public void getViewCount (int id) {}
}
