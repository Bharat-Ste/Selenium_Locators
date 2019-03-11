package com.guru99.webdriver.locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class key_board_TAB_operations {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		
		// Firefox bin path which version you wanna to test in browser.
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		
		WebDriver Driver = new FirefoxDriver();
		
		Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		//  Put implicit wait
		Driver.manage().window().maximize();              				   //   Maximize browser
		
		Driver.get("https://www.google.com/advanced_search");
		//http://artoftesting.com/sampleSiteForSelenium.html
		Thread.sleep(2000);
		
		WebElement text = Driver.findElement(By.id("xX4UFf"));
		text.clear();
		Actions act  = new Actions(Driver);
		act.sendKeys("hello").perform();
		String val = Driver.findElement(By.id("xX4UFf")).getAttribute("value");
	    System.out.println("inserted value is :" + val);
		
	    WebElement element2 = Driver.findElement(By.id("CwYCWc"));
		element2.sendKeys(val);
		
			
		
		
		//act.moveToElement(text).doubleClick().contextClick().build().perform();
		
		
		/*Action kbEvents = make.keyDown(text, Keys.SHIFT)
		 * 						.sendKeys("Java Code Geeks")
				        		.keyUp(text, Keys.SHIFT)
				        		.doubleClick()
				        		.contextClick()
				        		.build();
		kbEvents.perform();
		text.clear();
		
		Action kbEvents1 = act.keyDown(text, Keys.SHIFT)
				               .sendKeys("Java Code Geeks1")
		                       .keyUp(text, Keys.SHIFT)
		                       .doubleClick()
		                       .contextClick()
		                       .build();
		                       
		                       kbEvents1.perform();
		

		
		
	
		
		
		//WebElement element2 = Driver.findElement(By.id("CwYCWc"));
//		
//		act.sendKeys(Keys.TAB).perform();
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();


		
		//act.moveToElement(text).keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		        
		
		Thread.sleep(5000);
		//Driver.quit();


		/*
		
		Driver.findElement(By.id("xX4UFf")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		
		//Paste into another text filed
		Driver.findElement(By.id("CwYCWc")).clear();
		WebElement element2 = Driver.findElement(By.id("CwYCWc"));
		Actions actions = new Actions(Driver);
		Driver.findElement(By.id("CwYCWc")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		*/
				
		
		
//		actions.sendKeys(Driver.findElement(By.id("xX4UFf")),"hello").perform();
//		actions.sendKeys(Keys.TAB).perform();
//		actions.sendKeys("hellow how are you ?").perform();
//		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
//		
//	
//		actions.sendKeys(Keys.TAB).perform();;
//		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		

		//Driver.quit();
		

	}

}
