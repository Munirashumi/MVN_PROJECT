package learningAutomation12Mar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_Assignment {

	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	 public void setUp() {
		   options = new ChromeOptions();
		   options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		   options.addArguments("--start-maximize");
		   options.addArguments("--incognito");
		   options.addArguments("--remote-allow-origins=*");
		   driver = new ChromeDriver(options);
		   driver.get("https://tutorialsninja.com/demo");
	 }
	
	@Test
	public void verifyingLoginWithValidCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); // here two values/compound values
		
		//we use other locator options
		//Xpath and cssSelector
	}
}
