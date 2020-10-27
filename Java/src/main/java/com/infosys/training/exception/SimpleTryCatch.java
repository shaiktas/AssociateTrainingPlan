package com.infosys.training.exception;

public class SimpleTryCatch {

  public static void main(String args[]) {
    int data = 0;
    try  {
       data = 100 / 0;

    } catch (ArithmeticException e) {
      System.out.println(e);
      System.out.println("after error occured after catch");
    } finally{
      System.out.println("Finally code after ArithmaticException--");
    }
    //rest code of the program
    System.out.println("after error occured before catch");

    System.out.println("value is "+data);
    System.out.println("rest of the code...");

    int[] a = {2,4,5,6};
    System.out.println("total elements size in array "+a.length);

    try {
      int arraElement = a[4];
      System.out.println("111111");
    }catch(Throwable e){
      System.out.println("Exception caught here-"+e);
    } finally{
      System.out.println("Finally code after ArrayIndex--");
    }

    System.out.println("after getting 4th index from array");

    String s_1 = null;
    try {
      s_1.replace('a', 'b');
    }catch(Exception e){
      System.out.println("Exception caught here-"+e);
    }finally{
      System.out.println("Finally code after Nullpointer--");
    }

    System.out.println("NullpointerException caught--");

  }



}

//Types of Exceptions

// 1.  Checked Exception
//The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions
// e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.
// 2.  Unchecked Exception
//The classes which inherit RuntimeException are known as unchecked exceptions
// e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
// 3. Error
//Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.
