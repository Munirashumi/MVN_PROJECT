package learningjava;

public class Indepth_Understanding_MainMethod {
	//main method is always public. only main method has the power of execution.
	//why is the main method always public?
	//If I swap the reserved keywords public static to static public will it take to work or not?
	//You are not allowed to change nomenclature of main to anything else. main remains main
	
	// Strings- one of the data types in java.
	
	public static void main(String[] args) {
		System.out.println("this is the main method");
		temp();
	}
	public static void temp() {
		System.out.println("this is the temp method ");
	}

}
