package moreStrings;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Main {

	public static void main(String[] args) {
		String a = "apples";
		String b = "sergiu";
		String c = "SERGIU";
		System.out.println(a.length());

		if (a.equals("apples")){
			System.out.println("It equals apples");
		}

		if (b.equals(c)){
			System.out.println("sergiu match");
		}

		if (b.equalsIgnoreCase(c)){
			System.out.println("sergiu match");
		}
	}

}
