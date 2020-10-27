package com.infosys.training.oops.abstraction;

public class Demo1 {

  public static void main(String [] args) {
    Salary s = new Salary("John", "San Mateo", 3, 3600.00);
    Employee e = new Salary("Albert", "Washington", 2, 2400.00);
    System.out.println("Call mailCheck using Salary reference --");
    s.mailCheck();
    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();
  }
}
