package selenium_locators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_menu 
{

	public static void main(String[] args) throws Exception 
	{

		//Gecko driver call
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		
		// Firefox bin folder path, which is used for automation
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		
		WebDriver Driver = new FirefoxDriver();
		
		// Launch browser with following URL
		Driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(3000);
		/*
		Select fruits = new Select(Driver.findElement(By.id("fruits")));
		fruits.selectByValue("apple");
		
		fruits.selectByVisibleText("Grape");
		fruits.deselectByVisibleText("Apple");
		Thread.sleep(5000);
		*/
		Select fruits =new Select(Driver.findElement(By.id("fruits")));

		List<WebElement> list = fruits.getOptions();
		System.out.println("List contains Items count :: " + list.size());
		Thread.sleep(5000);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println();
			System.out.println(list.get(i).getAttribute("value"));
		}
		
		Driver.quit();

	}

}
