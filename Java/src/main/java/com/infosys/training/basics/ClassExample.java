package com.infosys.training.basics;

public class ClassExample {
  public static void main(String[] args) {
    System.out.println("Hello, this is my first Class in JAVA!");
    ClassExample o1 = new ClassExample();

    // syntax
    // className vari = new className();
    int sum = o1.add(5, 5);
    System.out.println("sum of a and b is " + sum);
  }

  public int add(int a, int b) {
    int c = a + b;
    return c;
  }
}
