package com.infosys.training.exception;

public class ThrowExample {

  public static void main(String[] args) {

    int age = 15;
    if (age < 18) {
      throw new ArithmeticException("sorry too young, you cant get license");
    } else {
      System.out.println("Congrats, here is your driving license");
    }

  }
}

//The Java throw keyword is used to explicitly throw an exception.
