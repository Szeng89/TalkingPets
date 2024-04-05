package io.zipcoder.polymorphism;

public class Pet {
    private String name;
    private int age;

    public Pet(){}
    public Pet(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Pet(int age) {
        this.age = age;
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        return "Speaking";
    }

    public void setName(String name) {
        this.name = name;
    }
}
