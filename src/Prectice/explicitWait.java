package Prectice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/bharat/eclipse-workspace/Selenium_Locators/lib/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://hogaya.wiziqxt.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement loginBtn = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		
		/// Example for explicit wait
		new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(loginBtn));
		
		Thread.sleep(4000);
		//driver.quit();
		

	}

}
