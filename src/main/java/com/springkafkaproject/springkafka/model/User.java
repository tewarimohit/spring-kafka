package com.springkafkaproject.springkafka.model;

public class User {
    private int id;
    private String userName;
    private int age;

    public User() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{id=" + this.id + ", userName='" + this.userName + "', age=" + this.age + "}";
    }
}
