package com.naveen.locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileUpload_popup 
{
	public static String projectlocation = System.getProperty("user.dir");
	public static void main(String[] args) 
	{
		System.out.println("***************************** Firefox invocation **********************************");
		System.setProperty("webdriver.gecko.driver", projectlocation + "/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox-54.app/Contents/MacOS/firefox-bin");
		
		 WebDriver Driver = new FirefoxDriver();
		/*
		System.out.println("***************************** Chrome invocation **********************************");
		System.setProperty("webdriver.chrome.driver", projectlocation+"/lib/chromedriver/chromedriver");
		Driver=new ChromeDriver();
		Driver.manage().window().maximize();
        */
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    Driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    
	    Driver.get("https://html.com/input-type-file/");
	    
	//type="file"  attribute should be present for browseFile/uploadFile/AttachFile buttons, else send-keys method not working
	    Driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("Path");

	}

}
