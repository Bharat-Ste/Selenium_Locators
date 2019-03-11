package com.guru99.webdriver.locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import selenium_locators.dropdown_menu;

public class All_in_one_locaters 
{

	public static void main(String[] args) throws Exception 
	{
		//http://softwaretesting-guru.blogspot.com/p/main-page.html
		
		// gecko driver call
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		
		// Firefox bin path which version you wanna to test in browser.
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();              // Maximize browser
		
		Driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		Thread.sleep(2000);
		
		Driver.findElement(By.linkText("Selenium Practice page")).click();
		Thread.sleep(2000);
//		
		Driver.findElement(By.name("Name")).sendKeys("Bharat");
		Thread.sleep(2000);
		
		String getText_box = Driver.findElement(By.name("Name")).getAttribute("value");
		System.out.println("Inserted text value is  :  " + getText_box);
		
		
// Checkbox handeling		
		WebElement chk_box= Driver.findElement(By.name("subscribe"));
		chk_box.click();
		
		
 // Text box handeling		
		WebElement comments_txtbox = Driver.findElement(By.name("comments"));
		comments_txtbox.sendKeys("this is comment section, writing here some dummy text to verify."); 
		
// Dropdown list handeling
		Select drpdown = new Select(Driver.findElement(By.name("countries")));
		List<WebElement> list = drpdown.getOptions();
		for(int i=0;i<list.size();i++)
		{
			System.out.println("options are : " +  list.get(i).getText());
			
		}
		System.out.println("index 3 value us " + list.get(3).getText());
		drpdown.selectByVisibleText("Argentina");
		
		
		
		
// Multi selection list 
		
		Select multi_select = new Select(Driver.findElement(By.name("computerbrands")));
		List<WebElement> list_multi_select = multi_select.getOptions();
		for(int j =0 ; j< list_multi_select.size();j++)
		{
			System.out.println("Multi select items :" + list_multi_select.get(j).getText());
			
			if(list_multi_select.get(j).getText() == "IBM" || list_multi_select.get(j).getText() == "compaq")
			{
				list_multi_select.get(j).click();
				list_multi_select.get(j).isSelected();
				System.out.println("Selected value is : " + list_multi_select.get(j).getText());
			}
			
			
		}
		multi_select.deselectByVisibleText("IBM");
		//		multi_select.deselectByVisibleText("compaq");
		
// Radio button
//		Driver.findElement(By.xpath("//*[@id=\"sampleform\"]/table/tbody/tr[7]/td/input[3]")).click();
//		Thread.sleep(3000);
//		Driver.findElement(By.xpath("//*[@id=\"sampleform\"]/table/tbody/tr[7]/td/input[1]")).click();
		Driver.findElement(By.xpath("//input[@value='bad']")).click();
		
        Driver.quit();
	}

}
