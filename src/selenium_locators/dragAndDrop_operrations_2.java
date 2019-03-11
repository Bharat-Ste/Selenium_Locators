package selenium_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop_operrations_2 
{

	public static void main(String[] args) throws Exception 
	{
		
		// Gecko driver path
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		
		// Firefox bin path which version you want to test in browser.
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		
		Driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement source = Driver.findElement(By.id("drag1"));
		WebElement target = Driver.findElement(By.id("div2"));	
		
		System.out.println("" + source.getLocation());
		System.out.println("" + target.getLocation());
		
		Actions act = new Actions(Driver);
		Action dragAndDrop = act.clickAndHold(source).moveToElement(target).release(target).build();
		dragAndDrop.perform();
		
		Thread.sleep(5000);
		

	}

}
