package com.naveen.locaters;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bootStrap_dropdownList 
{
   public static WebDriver Driver;
   public static String projectlocation = System.getProperty("user.dir");
	
	public static void main(String[] args) throws InterruptedException 
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
		
		
		/*
		Driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Driver.findElement(By.xpath("//button[@type='button']")).click(); 
		
		*/
		
		
		// start the application
		 
	      Driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	 
	 
	       // First we have to click on menu item then only dropdown items will display
	 
	      Driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	 
	 
	 
	       // adding 2 seconds wait to avoid Sync issue
	 
	       Thread.sleep(2000);
	 
	 
	 
	       // Dropdown items are coming in <a> tag so below xpath will get all
	       // elements and findElements will return list of WebElements
	 
	       List<WebElement> list = Driver.findElements(By.xpath("/ul[@class='dropdown-menu']//li/a"));
	 
	 
	 
	       // We are using enhanced for loop to get the elements
	 
	       for (WebElement ele : list)
	 
	       {
	 
	          // for every elements it will print the name using innerHTML
	 
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	 
	 
	          // Here we will verify if link (item) is equal to Java Script
	 
	          if (ele.getAttribute("innerHTML").contains("JavaScript")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 
	 
	 
	             // break the loop or come out of loop
	 
	             break;
	 
	          }
	 
	       }
	 
	       // here you can write rest piece of code
	 
	   }
		

}
