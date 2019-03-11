package selenium_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class popup_windowHandeling {

	public static String browser;
	static WebDriver Driver;

	public static void main(String[] args) 
	{
		//get values from config properties file.			
		
			PropertiesFile.readProperties();  			/// Write text inside config.properties File		
			setBrowserConfig();                         /// setBrowser("ChroME");
			runTest();			
			//PropertiesFile.writeProprtyFile();			/// Write text inside config.properties File

	}

	public static void setBrowser(String BrowserName)
	{
		browser = BrowserName ;
//		System.out.println("..... selected browser :" + browser);
	}

	public static void setBrowserConfig()
	{
		String projectlocation = System.getProperty("user.dir"); // "/Users/bharat/eclipse-workspace/firstProject";
		System.out.println("project location is :: " + projectlocation);

		
		if(browser.toLowerCase().contains("firefox"))
		{
			System.out.println("***************************** Firefox invocation **********************************");
			System.setProperty("webdriver.gecko.driver", projectlocation + "/lib/geckodriver/geckodriver");
			System.setProperty("webdriver.firefox.bin","/Applications/Firefox-61.app/Contents/MacOS/firefox-bin");
			//System.setProperty("webdriver.firefox.bin", "/Applications/Firefox-54.app/Contents/MacOS/firefox-bin");
			Driver = new FirefoxDriver();	
		}
		if(browser.toLowerCase().contains("chrome"))
		{
			
			System.out.println("***************************** Chrome invocation **********************************");
			System.setProperty("webdriver.chrome.driver", projectlocation+"/lib/chromedriver/chromedriver");
			Driver=new ChromeDriver();
		}
	}

	public static void runTest()
	{
		
		Driver.manage().window().maximize();
		Driver.get("https://html.com/input-type-file/");
		
		WebElement fileUpload_btn = Driver.findElement(By.id("fileupload"));
		fileUpload_btn.sendKeys("/Users/bharat/Desktop/Disable Firefox auto update .png");
		//Driver.findElement(By.xpath(".//*[@id='post-206']/div/div[3]/form/input[2]")).click();
		
		
		
		//Driver.quit();
	}

}
