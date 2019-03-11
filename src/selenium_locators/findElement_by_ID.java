package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElement_by_ID {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("http://www.indeed.co.uk");
		Thread.sleep(2000);
		
		//Locator using ID
		WebElement what_Input_txt= Driver.findElement(By.id("text-input-what"));
	    what_Input_txt.sendKeys("selenium");
		
		System.out.println("-------------------------- ID -------------------------------");		
		
		WebElement Where_inout_text = Driver.findElement(By.id("text-input-where"));
		Where_inout_text.sendKeys("");
		
		

		
		
		Driver.quit();

	}

}
