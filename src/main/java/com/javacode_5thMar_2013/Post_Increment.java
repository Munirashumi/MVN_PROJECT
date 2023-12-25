package com.javacode_5thMar_2013;

public class Post_Increment {

	public static void main(String[] args) {
		// Variable is i which is before ++
		//++ is coming after i. So ++ is post variable
		// post increment operator
		int i = 1;
		i++; // this is uni-body
		System.out.println(i); // 2
		int j = i++;
		System.out.println(j); //2
		System.out.println(i); //3
		
		j = i++ + i++;
	   // j = 3 + 4 = 7
	   //i= 4, 5
		System.out.println(i); //5
		System.out.println(j); //7
		
		j = i++ + i++ + i++ + i++;
		j = 5 + 6 + 7 + 8;
		
		System.out.println(i); //9
		System.out.println(j); //26
		
	}

}
