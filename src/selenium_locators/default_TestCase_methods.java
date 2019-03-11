package selenium_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface default_TestCase_methods 
{
	public void runTest() throws Exception;
	public void setBrowser();
	public void setBrowserConfig();
	public boolean login(WebElement uname,WebElement pwd) throws InterruptedException;

}
