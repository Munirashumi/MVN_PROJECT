package com.javacode_18thMarch_2023;

public class Iteration_LoopingStatements {
	
//In Iteration looping statement,some examples you need to learn:
    //while
	//for loop
	//nested for loop
	//advanced for loop

	public static void main(String[] args) {
	
		
		//while loop syntax
		
		//step1: you have to initialize a value of a variable
		//step2: you have to pass the condition in the while
		//step3: if your condition is true, the control will go inside the body of the while loop
		//step4: if your condition is false, the control will not go inside the body of the while loop
		//step5: to control your logic you may chose to increment or decrement a certain value
	
	boolean b1 = true;
	while(b1!= false) {
		System.out.println("The grass is green");
	break;
	
	
	}
	//print the first 10 natural numbers
			//1.....10
	
	int i = 1;
	while(i<=10) {
		System.out.print(i+ "");
	i++;
	}
	System.out.println();
	//print numbers backward from 20 to 1 using while loop
	
	int j =20;
	while(j>0) {
		System.out.print(j+"");
		j--;
	}
	System.out.println();
	//print first 20 multiples of 2
	 
	int numbers = 2;
	while(numbers<=20) {
		System.out.println(numbers*2+"");
		numbers++;
		
		int k = 1;
		while(k<=20) {
			System.out.print(k*2+"");
			k=k+1;
		}
		System.out.println();
		//print from 100,95,90,85.....5
		
		int l= 100;
		while(l>=1) {
			System.out.print(l+"");
			l=l-5;
		}
		
	}
	
	
	
	}
}
