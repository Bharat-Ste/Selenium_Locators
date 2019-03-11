package com.guru99.webdriver.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get_Background_color_of_Control {

	public static void main(String[] args) throws Exception {
		// gecko driver call
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		
		// Firefox bin path which version you wanna to test in browser.
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();              // Maximize browser
		
		Driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		String get_color = Driver.findElement(By.name("btnK")).getCssValue("background-color");
		System.out.println("btn backgroud color val is : " +get_color);
		System.out.println("btn backgroud expected  val should be : #f2f2f2");
		//Expected is #f2f2f2
		
		String font_typ = Driver.findElement(By.name("btnK")).getCssValue("font-family");
		//arial,sans-serif
		System.out.println("btn font family  is : " +font_typ);
		System.out.println("btn backgroud expected  val should be : arial,sans-serif");
		
		Driver.quit();
	}

}
