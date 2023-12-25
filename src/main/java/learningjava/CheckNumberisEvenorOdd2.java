package learningjava;

public class CheckNumberisEvenorOdd2 {

	public static void main(String[] args) {
		int a =39;
		int b = 20;
		
		if(a%2 == 0 && b%2 != 0) {
			System.out.println("a is an even number:" + a);
		}else if(b%2 == 0 && a%2 != 0) {
			System.out.println("b is an even number :" + b);
	}
	}
}
