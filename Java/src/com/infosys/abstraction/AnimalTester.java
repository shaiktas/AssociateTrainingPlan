package com.infosys.abstraction;

public class AnimalTester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.greeting());

        Rat rat = new Rat();
        System.out.println(rat.greeting());

        Dog dog = new Dog();
        System.out.println(dog.greeting());
    }
}
