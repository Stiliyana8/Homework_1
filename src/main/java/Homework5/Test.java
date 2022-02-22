package Homework5;

import oop.Breed;

public class Test {
    public static void main(String[] args) {

        Cat british = new Cat();
        Address catAddress = new Address();
        catAddress.setCity("Sofia");
        catAddress.setStreetName("Some street name.");
        catAddress.setPostalCode(1000);
        british.setAge(3);
        british.setBreed(new Breed("British"));
        british.setHasTail(false);
        british.setName("Darius");
        british.setAddress(catAddress);
        british.printData();

        Cat bengal = new Cat(true, "Archi", 3, new Breed("bengal"), 1456, catAddress);
        bengal.printData();

        Address fishAddress = new Address();
        fishAddress.setCity("Varna");
        fishAddress.setStreetName("Some street name.");
        fishAddress.setPostalCode(4000);
        Fish fish = new Fish(true, "Ariel", 1, new Breed("gupa"), 3589, fishAddress);
        fish.setAge(1);
        fish.setBreed(new Breed("gupa"));
        fish.setHasTail(true);
        fish.setName("Ariel");
        fish.setAddress(fishAddress);
        fish.printData();

        Address rabbitAddress = new Address();
        rabbitAddress.setCity("Plovdiv");
        rabbitAddress.setStreetName("Some street name.");
        rabbitAddress.setPostalCode(2000);
        Rabbit rabbit = new Rabbit(true, "Bugs", 5, new Breed("some breed"), 2489, rabbitAddress);
        rabbit.setAge(5);
        rabbit.setBreed(new Breed ("some breed"));
        rabbit.setHasTail(true);
        rabbit.setName("Bugs");
        rabbit.setAddress(rabbitAddress);
        rabbit.printData();

        british.run();
        fish.run();
        rabbit.jump();
    }
}
