package com.infosys.training.exception;

import java.io.IOException;

public class ThrowsExample {

  public static void main(String[] args) {

    ThrowsExample obj = new ThrowsExample();

    try {
      obj.test();
    } catch (Exception e) {
      System.out.println("Exception caught " + e);
    }


  }

  public void test() throws IOException {

    int age = 0;
    if (age == 0) {
      throw new IOException("Sorry, please enter valid age value");
    }
    if (age < 18) {
      throw new ArithmeticException("sorry too young, you cant get license");
    } else {
      System.out.println("Congrats, here is your driving license");
    }

  }
}

//The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.
//https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws
