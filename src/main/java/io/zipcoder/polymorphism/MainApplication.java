package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Do you have any pets?");
        while (!scanner.hasNextInt()) {
            System.out.println("Surely you jest, How many pets do you have?");
            scanner.next();
        }
        int howManyPets = scanner.nextInt();

        ArrayList<String> petName = new ArrayList<>();
        ArrayList<Pet> kindOfPet = new ArrayList<>();

        scanner.nextLine();
        for (int i = 1; i <= howManyPets; i ++) {
            System.out.println("Whats the name of pet " + i + "?");
            String nameOfPets = scanner.nextLine();
            petName.add(nameOfPets);

            System.out.println("What kind of pet is pet " + i + "?");
            String whatKindOfPet = scanner.nextLine();

            if (whatKindOfPet.toLowerCase().equals("dog")) {
                Dog dog = new Dog(nameOfPets);
                kindOfPet.add(dog);
            }
            if (whatKindOfPet.toLowerCase().equals("cat")) {
                Cat cat = new Cat(nameOfPets);
                kindOfPet.add(cat);
            }
            if (whatKindOfPet.toLowerCase().equals("turtle")) {
                Turtle turtle = new Turtle(nameOfPets);
                kindOfPet.add(turtle);
            }
        }
        for(int i = 0; i < kindOfPet.size(); i++) {
            System.out.println(kindOfPet.get(i).getName() + " goes " + kindOfPet.get(i).speak());
        }

    }


}
