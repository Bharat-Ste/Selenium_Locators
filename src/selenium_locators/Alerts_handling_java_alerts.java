package selenium_locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_handling_java_alerts 
{
	// http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/
	
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		
 // Handle alert box with OK button
		
		WebElement alertboxbtn1 = Driver.findElement(By.xpath("//*[@id=\"alert\"]"));
		alertboxbtn1.click();
		Alert alert = Driver.switchTo().alert();
		System.out.println("Alert txt :"  + alert.getText());		
		alert.accept();				
		
		
		System.out.println(" action performed : " + Driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText() );
		
		Thread.sleep(5000);
		
		
// Handle Confirmation alert box :- 'OK AND cancel' buttons		
		
		WebElement confirmboxbtn1 = Driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
		confirmboxbtn1.click();
		Alert confrm_alrt = Driver.switchTo().alert();
		System.out.println("Alert txt :"  + confrm_alrt.getText());		
		confrm_alrt.accept();	          // OK clicked
		
		System.out.println(" action performed : " + Driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText() );
		
			Thread.sleep(5000);
		
		confirmboxbtn1.click();
		confrm_alrt.dismiss();           // cancel clicked
		
		System.out.println(" action performed : " + Driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText() );
		
//		Handle Prompt alert box with asking for input :- 'OK AND cancel' buttons		
		
		WebElement prompt_alrt_btn = Driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
		prompt_alrt_btn.click();
		
		Alert promt_alrt = Driver.switchTo().alert();
		System.out.println("Prompt alert text is :: " + promt_alrt.getText() );
		promt_alrt.sendKeys("Bharat");
		promt_alrt.accept();			// OK clicked
		
		System.out.println(" action performed : " + Driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText() );
		
		Thread.sleep(5000);
		
		prompt_alrt_btn.click();
		promt_alrt.dismiss();		   // cancel clicked
		System.out.println(" action performed : " + Driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText() );
		
		
		
		Thread.sleep(6000);
		Driver.quit();
		
		
		

	}

}
