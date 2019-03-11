package selenium_locators;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenShot_take 
{
	public static String projectlocation = System.getProperty("user.dir"); 
	public static void main(String[] args) throws Exception 
	{

		System.out.println("***************************** Firefox invocation **********************************");
		System.setProperty("webdriver.gecko.driver", projectlocation + "/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
		//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox-54.app/Contents/MacOS/firefox-bin");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		Thread.sleep(2000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/bharat/eclipse-workspace/Selenium_Locators/src/selenium_locators/output.png"));
		//String screenshotBase64 = ((TakesScreenshot) Driver).getScreenshotAs("/OutputType.png");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
