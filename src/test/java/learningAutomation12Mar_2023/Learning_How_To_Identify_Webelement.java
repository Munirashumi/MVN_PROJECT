package learningAutomation12Mar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Learning_How_To_Identify_Webelement {
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
	   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
 }
 
 @Test
 public void understandingWebElementsRediffLogin() {
	 //username textbox - identify
	 
	 driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	 
	 //password textbox
	 
	 driver.findElement(By.id("password")).sendKeys("Selenium@123");
	 
	 //signin button
	 
	 driver.findElement(By.className("signbtn")).click();
	 
	 //logout link
	 
	 driver.findElement(By.className("rd_logout")).click();
	 
	 //Rediff Home link
	 //if there is no id,class or name-
	 
	 driver.findElement(By.linkText("Rediff Home")).click();
 
	 //Sign in link
	 
	 driver.findElement(By.className("signin")).click();
     driver.findElement(By.linkText("Sign in")).click();

     //Create Account Link
     driver.findElement(By.linkText("Create Account")).click();
     driver.findElement(By.partialLinkText("Create Acc")).click();
 
 }
 
}
