package Homework5;

public class Rabbit extends Pet{

    public Rabbit(boolean hasTail, String name, int age, Breed breed, int barcode, Address address) {
        super(hasTail, name, age, breed, barcode, address);
    }

    public void eat(){
        System.out.println("I like to eat grass.");
    }
}
