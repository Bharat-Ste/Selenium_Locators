package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElements_by_XPath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("http://www.indeed.co.uk");
		
		//<input aria-describedby="label-q-error" aria-labelledby="label-q" id="text-input-what" name="q" autocomplete="off" class="icl-TextInput-control icl-TextInput-control--whatWhere" type="text">
		
		WebElement what_ = Driver.findElement(By.xpath("//input[@id='text-input-what']"));
		what_.sendKeys("Selenium");
		Thread.sleep(3000);		
		
		Driver.quit();

	}

}
