package selenium_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_operations 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		// Gecko driver path
		System.setProperty("webdriver.gecko.driver","/Users/bharat/eclipse-workspace/Dummy/lib/geckodriver/geckodriver");
		
		// Firefox bin path which version you want to test in browser.
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		
		WebDriver Driver = new FirefoxDriver();
//      Driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
//		WebElement source = Driver.findElement(By.id("drag1"));
//		WebElement target = Driver.findElement(By.id("div2"));
		
		Driver.get("http://jqueryui.com/droppable/");
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.switchTo().frame(0);
		
		WebElement source = Driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement target = Driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		System.out.println("===================================================");

		Actions act = new Actions(Driver);
		act.dragAndDrop(source, target).perform();
		
		Thread.sleep(4000);
		Driver.quit();

	}

}
