package selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("http://www.indeed.co.uk");
		System.out.println("-------------------------- get ALL ELEMENTS with tag name 'a' -------------------------------");
		System.out.println(" Element 'a' exist count is :: " + Driver.findElements(By.tagName("a")).size());
		
		System.out.println(" className 'ipput_text' exists count is :: " + 
		Driver.findElements(By.className("input_tesxt")).size()
		);
		
		System.out.println("-------------------------- Store all links in LinkList<> 'a' -------------------------------");
		System.out.println(" Element 'a' exist count is :: " + Driver.findElements(By.tagName("a")).size());
		
		
		
		Driver.quit();
	}

}
