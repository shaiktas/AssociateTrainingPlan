package com.infosys.training.exception;

public class FinallyExample {

  public static void main(String[] args) {
    int[] a = {2, 4, 5, 6};
    System.out.println("total elements size in array " + a.length);

    try {
      int arraElement = a[4];
      System.out.println("111111 " + arraElement);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception caught here-" + e);
    } finally {
      System.out.println("Finally code after ArrayIndex--");
    }

    try {
      String s = null;
      String s1 = s.substring(0);
      System.out.println("after exceptions " + s1);
    }
  catch(NullPointerException e){
    System.out.println("Exception caught here-" + e);
  }finally{
      System.out.println("Finally code after ArrayIndex--");
    }
  }
}

//Java finally block is a block that is used to execute important code such as closing connection, stream etc.
//Java finally block is always executed whether exception is handled or not.
