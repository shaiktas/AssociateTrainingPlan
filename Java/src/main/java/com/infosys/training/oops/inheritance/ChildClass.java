package com.infosys.training.oops.inheritance;

public class ChildClass extends ParentClass {

  public static void main(String[] args){
    ChildClass c1 = new ChildClass();
    System.out.println("parent var1"+c1.a);
    System.out.println("parent var2"+c1.b);
    c1.common_1();
    c1.common_2();

  }

}
