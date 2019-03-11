package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElements_by_linkText {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("http://www.indeed.co.uk");
//		Thread.sleep(2000);
		
		//Locator LinkText
		System.out.println("-------------------------- linkText -------------------------------");
		WebElement LinkTExt_ = Driver.findElement(By.linkText("Upload your CV"));
		System.out.println("Linktext found : "+ LinkTExt_);
		LinkTExt_.click();
		Thread.sleep(2000);
		
		System.out.println("-------------------------- PratiallinkText -------------------------------");
		WebElement LinkTExt_partial = Driver.findElement(By.partialLinkText("Post Job"));
		LinkTExt_partial.click();
		Thread.sleep(2000);
		
		

		
		
		
		Driver.quit();

	}

}
