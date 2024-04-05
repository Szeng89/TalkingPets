package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat() {
        super();
    }

    public Cat(int age) {
        super(age);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}
