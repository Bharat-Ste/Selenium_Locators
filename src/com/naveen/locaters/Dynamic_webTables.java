package com.naveen.locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic_webTables 
{
	public static WebDriver Driver;
    public static String projectlocation = System.getProperty("user.dir");
    
	public static void main(String[] args) throws Exception 
	{
		
		
		System.out.println("***************************** Chrome invocation **********************************");
		System.setProperty("webdriver.chrome.driver", projectlocation+"/lib/chromedriver/chromedriver");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--kiosk");
		Driver = new ChromeDriver(chromeOptions);
		
		Driver.manage().deleteAllCookies();
		
		//Dynamic wait
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Driver.get("https://www.freecrm.com/index.html");
		
		Driver.findElement(By.name("username")).sendKeys("naveenk");
		Driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
		
		Driver.switchTo().frame("mainpanel");
		Driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
		
// Method 1. implementing for loop		
		
		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i =4;i<15 ;i++ )
		{
			
			String extrated_title = Driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText().trim();
			String expected_title = "aa1 Cris" ;
			//System.out.println("Extraced_title is : " + extrated_title + " and expected Tile should be : " +  expected_title);
			
			if(extrated_title.equals(expected_title))
			{
				System.out.println("*********************");
				System.out.println("Expected Title " +expected_title+ " matched with expected title : " +extrated_title +" on index No :" + i);
				
			}
			else
			{
				System.out.println("not matched");
			}
			
			
		}
		
// Method 2. using preceding-sibling :: Just above of selected xpath And following-sibling  :: Just below of selected xpath 
		     
		/* 
		 Example :- 
		 //  List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
		 */
		
		Driver.findElement(By.xpath("//a[contains(text(),'Mona Sharma')]/parent::td/preceding-sibling::td//input[@type='checkbox']")).click();
		
		
		
		
		
		
		
		Driver.quit();
		

	}

}
