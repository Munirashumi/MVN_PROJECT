package com.javacode_18thMarch_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {
		
	//for(initialize;condition;inc/dec {
		//programming code
		//}
		
		
		//Flow of logic
		
		//step1: initialize value is taken into consideration
		//step2: check for the condition
		//step3: if the condition is true,the control flow will go inside the body of the for loop
		//step4: if the condition is false,then it will exit
		//step5: then control goes to iteration and it is compared with the condition
		//step6: then the logic again goes back in the same flow till the condition is false
		
		for(int i =1; i<=5; i++) {
			System.out.println("the value of i is:"+i+"");
		}
		
		//print 1 to 20 using for loop
		
		for (int i = 1; i<=20; i++) {
			System.out.print(i+"");//12....20
		}
		
		System.out.println();
		
		//print first 10 multiples of 5 using for loop
		
		for(int i=5; i<=50; i=i+5) {
			System.out.print(i+"");
		}
		//print starting from 100 and decreasing 10 till 0
		//100,90,80,70,.....0
		for(int i =100;i>=0;i=i-10) {
			System.out.print(i+"");
		}
		
		//print first 20 multiples of 2 and add the values and give the sum
		//2,4,6,8,....20
		//sum=2+4+6+8....+40=?
		
		System.out.println();
		
		
		 int sum = 0; 
		 for(int i = 2; i<=40; i=i+2){
			 
		 System.out.print(sum=sum+(i*2));
		 
		 }
	}

}
