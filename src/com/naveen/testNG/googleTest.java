package com.naveen.testNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest 
{
	public static WebDriver driver;
	public static String projctlocation = System.getProperty("user.dir");
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", projctlocation+"/lib/chromedriver/chromedriver");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/?gws_rd=ssl");
		
	}
 	
	@Test
	public void googleTitleTest() throws Exception
	{
		
		String Title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("Page Title is  : " + Title);
		
	}
	
	@Test
	public void googleLogoTest() throws Exception
	{
		boolean status  = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		status=false;
		System.out.println("status is  ::" + status);
		if(status==true)
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Failed");
			
		}
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	

}
