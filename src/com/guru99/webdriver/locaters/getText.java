package com.guru99.webdriver.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getText 
{

	public static void main(String[] args) 
	{
		// gecko driver call
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		
		// Firefox bin path which version you wanna to test in browser.
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();              // Maximize browser
		
		Driver.get("https://www.w3schools.com/html/html_tables.asp");
		String tbl_val = Driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();
		System.out.println("table value is  :: " + tbl_val);
	}

}
