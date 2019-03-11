package com.naveen.locaters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readPropetiesFile 
{
	public static String projectlocation = System.getProperty("user.dir");
	public static WebDriver Driver;
	
	public static void main(String[] args) throws Exception 
	{
		
	//1. Create Object for Properties Class	
		Properties prop = new Properties();   
		
	//2. Set Properties file path
		FileInputStream ip = new FileInputStream("/Users/bharat/eclipse-workspace/Selenium_Locators/src/com/naveen/locaters/config.properties");

		prop.load(ip); // Load properties file
		
	//3. Access properties value's
		
		System.out.println("browser :: " + prop.getProperty("browser"));
		System.out.println("URL :: " + prop.getProperty("URL"));
		
	//4. Store values in string
		
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("URL");
		
		
	 if (browserName.equalsIgnoreCase("chrome"))
	 {
		 System.out.println("***************************** Chrome invocation **********************************");
			System.setProperty("webdriver.chrome.driver", projectlocation+"/lib/chromedriver/chromedriver");
			Driver=new ChromeDriver();
			Driver.manage().window().maximize();
		 
	 }
	 else if (browserName.equalsIgnoreCase("Firefox"))
	 {
		 System.out.println("***************************** Firefox invocation **********************************");
			System.setProperty("webdriver.gecko.driver", projectlocation + "/lib/geckodriver/geckodriver");
			System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
			//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox-54.app/Contents/MacOS/firefox-bin");
			Driver = new FirefoxDriver();
			Driver.manage().window().maximize();
	 }
		
		
	Driver.get(url);
		
		
	}

}
