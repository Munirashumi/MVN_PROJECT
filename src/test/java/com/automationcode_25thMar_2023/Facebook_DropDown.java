package com.automationcode_25thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_DropDown{
	
	public WebDriver driver;

	@BeforeMethod
	public void openUrl() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
	}
	
	@Test
	public void dropDownTest() throws Exception {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'fristname']")).sendKeys("Shumi");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Jhn");
		driver.findElement(By.xpath("//input[@name = 'reg_email_']")).sendKeys("shumijhn@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation_']")).sendKeys("shumijhn@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_password_']")).sendKeys("Shumi13579");
		//dropdown automation
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		//select.selectByIndex(1);
		//select.selectByValue("July");
		selectMonth.selectByVisibleText("Aug");
		
		Select selectDay = new Select(driver.findElement(By.id("month")));
		selectDay.selectByVisibleText("10");
		
		Select selectYear= new Select(driver.findElement(By.id("month")));
		selectYear.selectByVisibleText("1997");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
