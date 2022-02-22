package Homework5;

public class Cat extends Pet{
    public Cat(boolean hasTail, String name, int age, Breed breed, int barcode, Address address) {
        super(hasTail, name, age, breed, barcode, address);
    }
    public Cat(){
        super(false, "", 0, new Breed(""), 0, null);
    }

    public void meow(){
        System.out.println("Meow meow");
    }
}
