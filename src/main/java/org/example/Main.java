package org.example;

public class Main {
    public static void main(String[] args) {
        //Add Owner
        Owner Dominic = new Owner("Dominic", 20, "Berlin");
        //Add Species
        Species mammal = new Species("Mammal", "1500g/day");

        Animal animal1 = new Animal("A700", "Simba", "Lion", 5, new Owner("Peter", 54, "London"), mammal);
        Animal animal2= new Animal("A701", "Kalimba", "Elefant", 20, Dominic, mammal);
        Animal animal3= new Animal("A702", "Gunni", "Pinguin", 3, Dominic, new Species("FakeBird", "1000g/day"));
        Animal animal4= new Animal("A703", "Piggy", "Pig", 7, Dominic, mammal);
        Animal animal5= new Animal("A704", "Dominic", "Giraffe", 15, Dominic, mammal);

        //Call the automatically generated methods in the Record and check if they do what you expect (equals, toString).

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal5);
        System.out.println("______________");
        //equals method of animal1 and animal2
        System.out.println(animal1.equals(animal2));







    }
}