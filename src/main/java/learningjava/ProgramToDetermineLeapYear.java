package learningjava;

public class ProgramToDetermineLeapYear {

	public static void main(String[] args) {
		int year = 2023;
		// how will you prove this year is a leap year or not
		
		//1996 is a leap year
		//2000 is a leap year
		
		// The condition is determine a year is leap year or not
		
		//1. the year is divisible by 400
		//2. the year is divisible by 4 but not divisible by 100
	
		if(year%4 ==0 && year%100 != 0 || year%400 == 0) {
	System.out.println("year 2023 is not a leap year");
		}else {
			System.out.println("1980 is a leap year");
	}

	}
}
