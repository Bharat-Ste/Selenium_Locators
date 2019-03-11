package com.naveen.hashmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest_usingData 
{
	WebDriver driver;
	public String credentials;
    public String[] adminInfo;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bharat/eclipse-workspace/Selenium_Locators/lib/chromedriver/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.freecrm.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	@Test(priority = 1)
	public void loginAdminTest()
	{
		credentials = data.getUserLoginInfo().get("admin");
		adminInfo = credentials.split("~");
		String usrName = adminInfo[0];
		String usrPwd = adminInfo[1];
		
		
		
		
		driver.findElement(By.name("username")).sendKeys(usrName);
		driver.findElement(By.name("password")).sendKeys(usrPwd);
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		loginBtn.click();
	}

	@Test(priority = 2)
	public void loginTeacherTest()
	{
		credentials = data.getUserLoginInfo().get("teacher");
		adminInfo = credentials.split("~");
		String usrName = adminInfo[0];
		String usrPwd = adminInfo[1];
		
		
		
		
		driver.findElement(By.name("username")).sendKeys(usrName);
		driver.findElement(By.name("password")).sendKeys(usrPwd);
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		loginBtn.click();
	}
	
	@AfterMethod
	public void exitSetup()
	{
		driver.quit();
	}
}
