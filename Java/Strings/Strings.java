package Strings;

public class Strings {

	public static void main(String[] args) {
		String str = "String test";
		
		System.out.println("The first character of the string is "+str.charAt(0));
		System.out.println("The index of teh first ' ' is "+str.indexOf(' '));
		System.out.println("Unicode for 't' is "+str.codePointAt(7));
	}

}
