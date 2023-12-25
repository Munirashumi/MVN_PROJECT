package com.javacode_19th_Mar_2023;

public class MoreOnForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// for loop inside for loop is called nested for loop
		
		for (int i=1; i<=2;i++) {//outer for loops represents rows
			
			for(int j =1; j<=5; j++) {//inner for loops represents cols
				//body of the inner for loop
				System.out.print("Hello");
			}
			
			//this is the body of the outer for loop
			System.out.println("Row");
		}
		
	}

}
