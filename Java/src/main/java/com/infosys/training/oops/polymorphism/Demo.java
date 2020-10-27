package com.infosys.training.oops.polymorphism;

public class Demo {

  public static void main(String[] args) {
    Salary s = new Salary("Peter", "San Mateo", 3, 3600.00);
    Employee e = new Salary("Albert", "Los Vegas", 2, 2400.00);
    System.out.println("Call mailCheck using Salary reference --");
    s.mailCheck();
    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();//runtime poly
  }
}
