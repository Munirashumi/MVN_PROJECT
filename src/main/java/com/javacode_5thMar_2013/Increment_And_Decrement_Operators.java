package com.javacode_5thMar_2013;

public class Increment_And_Decrement_Operators {

	public static void main(String[] args) {
		int i = 10; //latest value of i is 10
		i++;
		System.out.println(i);
		int j = i++;
		System.out.println(j);
		System.out.println(i);
		
		int j1 = i++ + i++;
				System.out.println(j1);
				System.out.println(i);
		
	}

}
