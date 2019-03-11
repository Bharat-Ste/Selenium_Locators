package selenium_locators;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Download {

	public static void main(String[] args) throws Exception 
	{
		// Gecko driver path
				System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
				
				// Firefox bin path which version you want to test in browser.
				System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
				
				WebDriver Driver = new FirefoxDriver();
				Driver.manage().window().maximize();
				
				Driver.get("https://www.java.com/en/download/");
				Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				
				WebElement Dwn_btn = Driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span"));
				Dwn_btn.click();
				Thread.sleep(1000);

				
				WebElement Agree_btn = Driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span"));
				Agree_btn.click();
				Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				Alert alr=Driver.switchTo().alert();
				System.out.println("alert text is : " + alr.getText());
			
// Handling Window base controls	
				Robot rob_obj = new Robot();
				
// Perform Tab operation 
				
				rob_obj.keyPress(KeyEvent.VK_TAB);
				
				//Thread.sleep(2000);
// Perform Enter operation	
				rob_obj.keyPress(KeyEvent.VK_TAB);
				rob_obj.keyPress(KeyEvent.VK_ENTER);
				
				
				Thread.sleep(5000);	
				//Driver.quit();

	}

}
