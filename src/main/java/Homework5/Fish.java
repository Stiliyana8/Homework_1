package Homework5;

public class Fish extends Pet{
    public Fish(boolean hasTail, String name, int age, Breed breed, int barcode, Address address) {
        super(hasTail, name, age, breed, barcode, address);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " is swimming");
    }

    public void breath(){
        System.out.println("I breathe in water.");
    }
}
