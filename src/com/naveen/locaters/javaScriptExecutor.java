package com.naveen.locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javaScriptExecutor 
{
    public static WebDriver Driver;
    public static String projectlocation = System.getProperty("user.dir");
    
	public static void main(String[] args) throws Exception 
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
		
		Driver.get("https://www.freecrm.com/index.html");
		
		Driver.findElement(By.name("username")).sendKeys("naveenk");
		Driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(2000);
		WebElement login_btn = Driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		System.out.println("invoking flash method");
		flash(login_btn,Driver);
		Thread.sleep(4000);
		Driver.quit();

	}
	
	
	public static void flash(WebElement element,WebDriver Driver) throws Exception
	{
		System.out.println("inside flash mathod");
		JavascriptExecutor js = ((JavascriptExecutor)Driver);
		String Def_bgColor = element.getCssValue("backgroundcolor");
		
		for(int i=0;i<=100;i++)
		{
			changeColor("rgb(0,200,0)",element,Driver);
			changeColor(Def_bgColor, element,Driver);
		}	
		
	}
	
	public static void changeColor(String newColor,WebElement element,WebDriver Driver) throws Exception
	{
		System.out.println("inside change mathod");
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+newColor+"'", element);
		try
		{
			Thread.sleep(2000);
			
		}
		catch(InstantiationError e)
		{
			System.out.println("inside catch block : exception occured ");
			System.out.println("Exeception occured : " +  e.toString());
		}
	}

}
