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
        ArrayList<String> kindOfPet = new ArrayList<>();

        scanner.nextLine();
        for (int i = 1; i <= howManyPets; i ++) {
            System.out.println("Whats the name of pet " + i + "?");
            String nameOfPets = scanner.nextLine();
            petName.add(nameOfPets);

            System.out.println("What kind of pet is pet " + i + "?");
            String whatKindOfPet = scanner.nextLine();
            kindOfPet.add(whatKindOfPet);
        }
        System.out.println(kindOfPet + " named " + petName);

    }


}
