package learningautomation_11Mar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TN_fristCode {
    public static WebDriver driver;
    public static ChromeOptions options;
    
	public static void main(String[] args) {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	driver = new ChromeDriver(options);
	driver.get("https://www.rediff.com/");
    driver.findElement(By.linkText("Create Account")).click();
    driver.findElement(By.linkText("Login")).click();
	}

}
