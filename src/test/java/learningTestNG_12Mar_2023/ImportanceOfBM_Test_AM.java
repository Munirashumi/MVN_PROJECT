package learningTestNG_12Mar_2023;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//tri-combo - BM>Test1>Am BM>Test2>AM

public class ImportanceOfBM_Test_AM {

	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is bm");
	}
	@Test
	public void testCase1() {
		System.out.println("This is the case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is test case2");
	}
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is AM");
	}
}

