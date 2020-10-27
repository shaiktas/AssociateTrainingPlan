package com.infosys.training.basics;

public class StringImmu {

  public static void main(String[] args){

    String s="Peter";//1 objects Peter
    s.concat("John");//concat() method appends the string at the end, 2nd object PeterJohn
    s.concat("dude");//one more object Peter johb Dude
    System.out.println(s);

    String s_1= s.concat("John");
    String s_2 = s.concat(" ").concat(s_1).concat(" Hello");
    System.out.println(s_1);
    System.out.println(s_2);


  }


}
