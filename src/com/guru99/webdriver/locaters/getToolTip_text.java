package com.guru99.webdriver.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getToolTip_text {

	public static void main(String[] args) throws Exception 
	{
		// gecko driver call
				System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
				
				// Firefox bin path which version you wanna to test in browser.
				System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
				
				WebDriver Driver = new FirefoxDriver();
				Driver.manage().window().maximize();              // Maximize browser
				
				Driver.get("https://www.google.com/");
				WebElement aa = Driver.findElement(By.id("lst-ib"));
				aa.sendKeys("Advance search");
				
				Driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
				System.out.println("***********");
				Thread.sleep(4000);
				String Get_toolTip_txt = Driver.findElement(By.id("logo")).getAttribute("title");
				System.out.println("Tool tip value is  :: " + Get_toolTip_txt);

	}

}
