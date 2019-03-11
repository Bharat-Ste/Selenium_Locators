package com.naveen.locaters;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_window_popups_V10 
{
	public static String projectlocation = System.getProperty("user.dir");
	
	public static void main(String[] args) throws Exception 
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
		    
		    Driver.get("http://popuptest.com/goodpopups.html");
		    //http://rip747.github.io/popupwindow/
		    
		    Driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		    

		    Set<String> handler = Driver.getWindowHandles(); // Storing window ID's
            Iterator<String> it = handler.iterator();        // Create a loop for getting window ID's
		    
		    String parentWindowID = it.next();               // Storing Parent window ID in it
		    System.out.println("Parent window ID is " + parentWindowID + " And Title is  : " + Driver.getTitle()); 
		    
		    
		    String childWindowID = it.next();               // Storing Parent window ID in it
		    Driver.switchTo().window(childWindowID);
		    Thread.sleep(1000);
		    System.out.println("Child window ID is " + childWindowID + " And Title is  : " + Driver.getTitle());
		    Thread.sleep(1000);
		    Driver.close();                                // For closing Child window
		    
		    
		    Thread.sleep(2000);
		    Driver.switchTo().window(parentWindowID);
		    Thread.sleep(1000);
		    System.out.println("Switch back To ");
		    System.out.println("Parent window ID is " + parentWindowID + " And Title is  : " + Driver.getTitle());
		   
		    Thread.sleep(3000);
		    Driver.quit();

			

	}

}
