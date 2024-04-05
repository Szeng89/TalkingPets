package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pet;

public class Turtle extends Pet {
    public Turtle(int age, String name) {
        super(age, name);
    }

    public Turtle() {
        super();
    }

    public Turtle(int age) {
        super(age);
    }

    public Turtle(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Cowabunga!";
    }
}
