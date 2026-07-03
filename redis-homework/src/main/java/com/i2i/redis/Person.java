package com.i2i.redis;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toJson() {
        return "{\"id\":" + id +
                ",\"name\":\"" + name +
                "\",\"age\":" + age + "}";
    }
}