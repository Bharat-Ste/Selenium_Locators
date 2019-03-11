package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table_List 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("http://www.absofttrainings.com/selenium-training-free-videos/");
		WebElement Link = Driver.findElement(By.cssSelector("span > a"));
		System.out.println("Link url is ::" + Link);
		Thread.sleep(3000);
		
		Driver.quit();

	}

}
