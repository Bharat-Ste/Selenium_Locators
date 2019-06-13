package Prectice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javaScriptExecutor 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/bharat/eclipse-workspace/Selenium_Locators/lib/chromedriver/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Incognito");
		options.addArguments("ignore-certificate-errors");
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.facebook.com");
	    shortWait(2000);
	    WebElement uname= driver.findElement(By.id("email"));
	    WebElement pass= driver.findElement(By.id("pass"));
	    WebElement loginBtn= driver.findElement(By.xpath("//input[@value='Log In']"));
	    shortWait(1000); 
	    uname.sendKeys("pussharma@gmail.com");
	    pass.sendKeys("pus@bharat*(82)");
	    drawBorder(loginBtn,driver);
	    shortWait(4000);
	    JsClick(loginBtn,driver);
	    //loginBtn.click();
	    shortWait(4000);
	    
	    
	    WebElement Logout_menu = driver.findElement(By.xpath("//div[@id='logoutMenu']"));
	    shortWait(2000);
	    Logout_menu.click();
	    //JsClick(Logout_menu,driver);
	    
	    shortWait(2000);
	    WebElement logoutBtn=driver.findElement(By.xpath("//ul[@role='menu']//span[text()='Log Out']"));
	    JsClick(logoutBtn,driver);
	    //logoutBtn.click();
	    
	    shortWait(6000);
	    
	
	}

	public static void shortWait(int wait)
	{
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void JsClick(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",ele);
	
	}
	
	public static void drawBorder(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border = '3px solid red'",ele);
	}
	
	public static void JsScrollInView(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollInView(true);",ele);
	}
	

}
