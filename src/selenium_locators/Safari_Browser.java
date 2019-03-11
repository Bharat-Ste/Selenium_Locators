package selenium_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari_Browser {
	
	static WebDriver Driver = new SafariDriver();

	public static void main(String[] args) 
	{
		
		Driver.get("https://reg.ebay.in/reg/PartialReg");
		String Title =  Driver.getTitle();
		System.out.println("Title is :: " + Title);
		Driver.quit();
		

	}

}
