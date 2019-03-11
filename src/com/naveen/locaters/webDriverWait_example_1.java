package com.naveen.locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverWait_example_1 
{
	public static String projectlocation = System.getProperty("user.dir");
	public static void main(String[] args) 
	{
		
		System.out.println("***************************** Firefox invocation **********************************");
		System.setProperty("webdriver.gecko.driver", projectlocation + "/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox-54.app/Contents/MacOS/firefox-bin");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://FaceBook.com");
		
		// Click on Login button, but check if it will visible then click on button else set wait time to 5 second
		
		
		//clickOn(driver,driver.findElement(By.xpath("//input[@value='Log In']")),20);
		clickOn(driver,driver.findElement(By.xpath("//input[starts-with(@id,'u_0_')]")),20);
		
	}
	
	public static void clickOn(WebDriver driver,WebElement locator,int timeout)
	{
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
