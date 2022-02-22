package Homework5;

import oop.Breed;

public class Pet implements PetActions{
    private boolean hasTail;
    private String name;
    private int age;
    private Breed breed;
    private int barcode;
    private Address address;

    public Pet(boolean hasTail, String name, int age, Breed breed, int barcode, Address address) {
        setHasTail(hasTail);
        setName(name);
        setAge(age);
        setBreed(breed);
        setBarcode(barcode);
        setAddress(address);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        if (barcode > 1000){
            this.barcode = barcode;
        }else{
            System.out.println("Invalid Data!");
        }
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Data");
        }
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid Data!");
        }

    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else{
            System.out.println("Invalid Data!");
        }

    }
    public void printData(){
        System.out.printf("This cat's name is %s.%nThis cat's age is %d.%nThis cat's breed is %s.%n", name, age, breed);
        if(hasTail){
            System.out.println("This cat has tail.");
        }else{
            System.out.println("This cat doesn't have tail.");
        }
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");

    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping.");

    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");

    }
}
