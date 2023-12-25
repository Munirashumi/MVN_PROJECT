package learningautomation_11Mar_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipule_Browswers {

	public static void main(String[] args) {
		String browserName = "edge";
		
	if(browserName.equals("chrome")) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:tutorialsninja.com/demo");
		driver.quit();
	}else if (browserName.equals("firefox")) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:flipkart.com");
		driver.quit();
	}else if (browserName.equals("edge")) {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https:amazon.com");
	    driver.quit();
	}else {
		System.out.println("nothing opened");
	}
	}
}
