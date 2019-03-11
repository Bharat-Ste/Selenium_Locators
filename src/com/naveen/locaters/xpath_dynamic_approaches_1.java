package com.naveen.locaters;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath_dynamic_approaches_1 implements default_TestCase_methods
{
	WebDriver Driver;
	public static String browser;
	public static String projectlocation = System.getProperty("user.dir"); 
	static xpath_dynamic_approaches_1 cls_obj = new xpath_dynamic_approaches_1();

	
	public static void main(String[] args) throws Exception 
	{
		cls_obj.setBrowser();
		cls_obj.setBrowserConfig();
		//cls_obj.runTest();
		//cls_obj.xpath_contains();
		cls_obj.find_Elements();
   
	}

	@Override
	public void setBrowser() 
	{
		browser = "firefox";
		
	}

	@Override
	public void runTest() throws Exception 
	{
	    Driver.manage().window().maximize();
	    Driver.manage().deleteAllCookies();
	    
	    Driver.get("https://www.ebay.com/");

	    
	    Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    Driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

//1. XPath by ID
	    
	    Driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("id");
	    Thread.sleep(4000);
	    Driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
	    
	    
//2. Xpath by name
	    Driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("name");
	    Thread.sleep(4000);
	    Driver.findElement(By.xpath("//input[@name='_nkw']")).clear();
	    	    
	    
	    
	    
//3. XPath by ClassName	    
	    Driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input ui-autocomplete-loading']")).sendKeys("class");
	    Thread.sleep(4000);
	    Driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input ui-autocomplete-loading']")).clear();
	    
	    
//4. XPath by ClassName
	    Driver.findElement(By.xpath("//input[@type='text']")).sendKeys("type");
	    Thread.sleep(4000);
	    Driver.findElement(By.xpath("//input[@type='text]")).clear();

	    
//5. XPath by Contains
	    
	    Driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("contains type");
	    Thread.sleep(4000);
	    Driver.findElement(By.xpath("//input[contains(@type,'text')]")).clear();

	    
//6. XPath by Starts-with
	    // used where dynamic value of type attribute like
	    // type = text_123
	    // type = text_345
	    // type = text_789 etc, here we have  'text_' is static and after this non-static
	    // here we can use starts-with 
	    
	    Driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("starts with");
	    Thread.sleep(4000);
	    Driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).clear();

	    
//7. XPath by ends-with
	    // used where dynamic value of type attribute like
	    // type = 123_text
	    // type = 345_text
	    // type = 789_text etc, here we have  '_text' is static and before this is non-static
	    // here we can use starts-with 	 
	    
	    Driver.findElement(By.xpath("//input[ends-with(@type,'text')]")).sendKeys("starts with");
	    Thread.sleep(4000);
	    Driver.findElement(By.xpath("//input[ends-with(@type,'text')]")).clear();
	    
	    
	    
	    
	    Driver.quit();
	    
	}
	

	public void xpath_contains() throws Exception
	{
		
		Driver.get("https://www.ebay.com/");
		
		// 
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		
		Thread.sleep(4000);
		
		Driver.quit();
		
	}
	
	public void find_Elements()
	{
		// get the total count of available links in the page
		Driver.get("http://hogaya.wiziqxt.com/");
		
		System.out.println("count of links :: " + Driver.findElements(By.tagName("a")));
		List <WebElement> linklist = Driver.findElements(By.tagName("a"));
		System.out.println("count of links are : " + linklist.size());
		
		
		for(int i=0; i<linklist.size();i++)
		{
			String linktext = linklist.get(i).getText();
			System.out.println("link text is on possition " + " is :: " + linktext);
		}
		
		// get the text of each link on the page
	}
	
	
	@Override
	public void setBrowserConfig() 
	{
		if(browser.toLowerCase().contains("firefox"))
		{
			System.out.println("***************************** Firefox invocation **********************************");
			System.setProperty("webdriver.gecko.driver", projectlocation + "/lib/geckodriver/geckodriver");
			System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
			//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox-54.app/Contents/MacOS/firefox-bin");
			Driver = new FirefoxDriver();
			Driver.manage().window().maximize();
			
		}
		if(browser.toLowerCase().contains("chrome"))
		{
			
			System.out.println("***************************** Chrome invocation **********************************");
			System.setProperty("webdriver.chrome.driver", projectlocation+"/lib/chromedriver/chromedriver");
			Driver=new ChromeDriver();
			Driver.manage().window().maximize();
		}
		
	}






}
