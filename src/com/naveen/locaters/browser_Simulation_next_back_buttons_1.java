package com.naveen.locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser_Simulation_next_back_buttons_1 implements default_TestCase_methods
{
	WebDriver Driver;
	public static String browser;
	public static String projectlocation = System.getProperty("user.dir"); 
	static browser_Simulation_next_back_buttons_1 cls_obj = new browser_Simulation_next_back_buttons_1();
	
	public static void main(String[] args) throws Exception 
	{
		cls_obj.setBrowser();
		cls_obj.setBrowserConfig();
		cls_obj.runTest();

	}

	@Override
	public void runTest() throws Exception 
	{
		Driver.get("http://facebook.com/");
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Page Title is (e.g. facebook) : "  + Driver.getTitle());
		
		Thread.sleep(2000);
		Driver.navigate().to("http://google.com");
		System.out.println("NaviagteTo performed, Page Title is (e.g. google) : "  + Driver.getTitle());
		Thread.sleep(2000);
		
		Driver.navigate().back();
		System.out.println("Back button clicked, Page Title is (e.g facebook) : "  + Driver.getTitle());
		Thread.sleep(2000);
		
		Driver.navigate().forward();;
		System.out.println("Forward button clicked, now page Title is (e.g. forward) : "  + Driver.getTitle());
		Thread.sleep(2000);
		
		
	}

	@Override
	public void setBrowser() 
	{
		browser = "firefox";
		
	}

	public void setBrowserConfig() 
	{
		if(browser.toLowerCase().contains("firefox"))
		{
			System.out.println("***************************** Firefox invocation **********************************");
			System.setProperty("webdriver.gecko.driver", projectlocation + "/lib/geckodriver/geckodriver");
			System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
			//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox-54.app/Contents/MacOS/firefox-bin");
			Driver = new FirefoxDriver();
			Driver.manage().window().maximize();
			
		}
		if(browser.toLowerCase().contains("chrome"))
		{
			
			System.out.println("***************************** Chrome invocation **********************************");
			System.setProperty("webdriver.chrome.driver", projectlocation+"/lib/chromedriver/chromedriver");
			Driver=new ChromeDriver();
			Driver.manage().window().maximize();
		}
		
	}


	

}
