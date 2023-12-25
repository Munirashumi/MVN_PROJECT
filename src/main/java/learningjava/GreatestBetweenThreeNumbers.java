package learningjava;

public class GreatestBetweenThreeNumbers {



	public static void main(String[] args) {

 int a = 10;

 int b = 20;

 int c = 30;

 

 if (a>b && a>c) {

System.out.println("a is the greatest number:" + a);

	}else if(b>a && b>c) {

		System.out.println("b is the greatest number:" + b);

	}else if(c>a && c>b) {

System.out.println("c is the greatest number:" + c);

}

}

}