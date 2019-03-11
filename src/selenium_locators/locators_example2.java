package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators_example2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("http://www.indeed.co.uk");
//		Thread.sleep(2000);
//		
//		//Locator using ID
//		WebElement what_Input_txt= Driver.findElement(By.id("text-input-what"));
//		what_Input_txt.sendKeys("selenium");
		
//		System.out.println("-------------------------- ID -------------------------------");		
		
//		WebElement Where_inout_text = Driver.findElement(By.id("text-input-where"));
//		Where_inout_text.sendKeys("");
		
		
		//Locator LinkText
//		System.out.println("-------------------------- linkText -------------------------------");
//		WebElement LinkTExt_ = Driver.findElement(By.linkText("Upload your CV"));
//		System.out.println("Linktext found : "+ LinkTExt_);
//		LinkTExt_.click();
//		Thread.sleep(2000);
		
//		System.out.println("-------------------------- PratiallinkText -------------------------------");
//		WebElement LinkTExt_partial = Driver.findElement(By.partialLinkText("Post Job"));
//		LinkTExt_partial.click();
//		Thread.sleep(2000);
		
		
//		WebDriver Driver1 = new FirefoxDriver();
//		Driver1.get("http://500px.com/");
//		String scr_lnk = Driver1.findElement(By.xpath("//a[@data-tab='people']")).getAttribute("href");
//		System.out.println("Extracted link : " + scr_lnk);
//		Thread.sleep(2000);
//		
//		WebElement landscape_lnk = Driver1.findElement(By.linkText("Landscapes"));
//		landscape_lnk.click();
		
		
//		System.out.println("-------------------------- cssSelector -------------------------------");
//		System.out.println(Driver.findElement(By.cssSelector("button.icl-Button icl-Button--primary icl-Button--md icl-WhatWhere-button")).getAttribute("type"));
//		
//		Thread.sleep(2000);
		
		
		System.out.println("-------------------------- get ALL ELEMENTS with tag name 'a' -------------------------------");
		System.out.println(" Element 'a' exist count is :: " + Driver.findElements(By.tagName("a")).size());
		
		System.out.println(" className 'ipput_text' exists count is :: " + 
		Driver.findElements(By.className("input_tesxt")).size()
		);
		
		
		
		Driver.quit();
	}

}
