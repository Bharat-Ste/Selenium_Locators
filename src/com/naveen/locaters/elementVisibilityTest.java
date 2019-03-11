package com.naveen.locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class elementVisibilityTest 
{
		public static WebDriver Driver;
		public static String projectlocation = System.getProperty("user.dir");

	public static void main(String[] args) 
	{
		System.out.println("***************************** Chrome invocation **********************************");
		System.setProperty("webdriver.chrome.driver", projectlocation+"/lib/chromedriver/chromedriver");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--kiosk");
		Driver = new ChromeDriver(chromeOptions);
		
		Driver.manage().deleteAllCookies();
		
		//Dynamic wait
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Driver.get("https://www.freecrm.com/register/");
		
// 1. isDisplayed() method : applicable for all elements 
		
		boolean submit_btn_visibility = Driver.findElement(By.id("submitButton")).isDisplayed();
		if(submit_btn_visibility==true )
		{
			System.out.println("submitButton visible");
		}
		else
		{
			System.out.println("submitButton NOT visible");
		}
		
// 2. isEnabled()
		boolean submit_btn_enable = Driver.findElement(By.id("submitButton")).isEnabled();
		if(submit_btn_enable==true )
		{
			System.out.println("submitButton is enabled state");
		}
		else
		{
			System.out.println("submitButton is not in enabled state");
		}
		
		// select I agree the term and condition checkbox
		
		Driver.findElement(By.name("agreeTerms")).click();
		boolean submit_btn_enable1 = Driver.findElement(By.id("submitButton")).isEnabled();
		if(submit_btn_enable1==true )
		{
			System.out.println("submitButton1 is enabled state");
		}
		else
		{
			System.out.println("submitButton1 is not in enabled state");
		}
		
// 3. isSelected() methods : only applicable for checkboxes, radio buttons and dropdown lists
		
		boolean checkbox_state_selected = Driver.findElement(By.name("agreeTerms")).isSelected();
		if(checkbox_state_selected==true )
		{
			System.out.println("submitButton is selected");
		}
		else
		{
			System.out.println("submitButton is not in selected state");
		}
		
		
		Driver.quit();
	

	}

}
