package com.infosys.training.oops.encapsulation;

public class RunEncap {
  public static void main(String args[]) {
    EncapTest encap = new EncapTest();
    encap.setName("James");
    encap.setAge(20);
    encap.setIdNum("12343ms");

    //System.out.println("-->direct public variable "+encap.name);

    //encap.name ="Peter";

    System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge()+" and IDNum "+encap.getIdNum());
  }
}
