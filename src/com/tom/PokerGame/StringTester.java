package com.tom.PokerGame;

public class StringTester {

	public static void main(String[] args) {
		
		String s = "Hello World";
		//          01234567890
		System.out.println(s.substring(7));
		System.out.println(s.substring(2,9));
		//印出dlroW olleH (s字串倒過來)
		for (int i = s.length() - 1; i >= 0; i--) {
		System.out.print(s.charAt(i));
		}	
		System.out.println();
		//將s2字串中的Tom改成boss
		String s2 = "Jack Tom Eric";
		//           0123456789012
		System.out.println(s2.indexOf("c"));
		System.out.println(s2.lastIndexOf("c"));
		/*s2 = s2.replace("Tom", "boss");
		System.out.println(s2);*/
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(s2.substring(0, index) + "boss" + s2.substring(index+name.length()));
		
		int a = Integer.parseInt("12");
		float b = Float.parseFloat("32.5");
		Integer A = a;
	}
		
}
