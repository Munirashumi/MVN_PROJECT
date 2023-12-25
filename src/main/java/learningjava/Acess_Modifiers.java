package learningjava;

public class Acess_Modifiers {

	public static void main(String[] args) {
		
	//There are 4 access modifiers in java
		//1. public - you can use 'public' everywhere across the project. It has accessed in all packages and classes
		//2. protected - access is within the package.It can have access outside the package(protected has certain range limitations)
		     //but the condition is that you have to have a Child Class.
		//3. private- This is strictly within the same class(It has accessed only particular class).
		//4. default- only within the package.
		
		
	}

	public static void sample() {
		System.out.println("this is a public sample method");
	}
	
	public static void sample1() {
		System.out.println("this is a protected sample method");
	}
	public static void cash() {
		System.out.println("this is a private cash method");
	}
	static void setup() {
		System.out.println("this is default setup method");
	}
	}
