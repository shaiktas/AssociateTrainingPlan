package com.infosys.training.basics;

public class StringTest {
  public static void main(String args[]) {
    char[] h = {'h', 'e', 'l', 'l', 'o', ','};

    String helloString = new String(h);

    System.out.println("char seq string-->"+helloString);

    String s = "hello,";//literal way of creating string

    String s1 = new String("hello");//using new keyword


    System.out.println("Direct string--> "+s);


//Literal way of creating String
    String s_1 = "Welcome";
    String s_2 = "Welcome";//it will not create a new object, instead it will just refer the already existing
                            //object from pool
//using new keyword

    String s_3 = new String("Welcome1");//will create one object
    String s_4 = new String("Welcome1");//will create another object


    System.out.println(s_3);
    System.out.println(s_4);

    if(s_3 == s_4){
      System.out.println("object are equal");
    }else{
      System.out.println("obects are not equal");
    }

    System.out.println("s_3 starts with W->"+s_3.startsWith("W"));
    System.out.println("s_3 starts with W->"+s_3.replace('1','2'));







  }
}
