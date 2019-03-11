package selenium_locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switch_frames implements default_TestCase_methods
{

	WebDriver Driver;
	public static String browser;
	public static String projectlocation = System.getProperty("user.dir"); 
	static switch_frames cls_obj = new switch_frames();
	
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		//switch_frames cl_obj = new switch_frames();
		cls_obj.setBrowser();                        // u can read browser name from configuration file as well.
		cls_obj.setBrowserConfig();
		cls_obj.runTest();

	}

	@Override
	public void setBrowser() 
	{
		browser = "chrome";
		
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

	@Override
	public void runTest() throws Exception
	{
		
		Driver.manage().deleteAllCookies();
		Driver.get("https://www.freecrm.com/");
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username = Driver.findElement(By.name("username"));
		WebElement password = Driver.findElement(By.name("password"));
		
		boolean login_success = login(username,password);
		
		if(login_success==true)
		{
			System.out.println("Success login");
			
			//boolean result = cls_obj.contacts();
			Driver.switchTo().frame("mainpanel");
			//Driver.findElement(By.xpath("//a[contains(text(),'Contacts')])")).click();
			Driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
			
			System.out.println("Contact button clicked");
			
			
			//System.out.println("Final click result is :: " + result);
			
		}
		else
		{
			System.out.println("Failed to login");
		}

		
		
	}

	@Override
	public boolean login(WebElement uname, WebElement pwd) throws InterruptedException 
	{

	    uname.sendKeys("Bharat18");
	    pwd.sendKeys("123456");
	    
	    System.out.println("username value is : " +uname.getAttribute("value"));
	    System.out.println("Password value is : " +pwd.getAttribute("value"));
	    
	    
	    
	    try
	    {
	  	    	
	    	Thread.sleep(5000);
		    
		    WebElement btn_login = Driver.findElement(By.cssSelector("input.btn"));
		    btn_login.click();
		    
		    Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    return true;
	  	    
	  	  
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Exception : inside catch block :: " + e.toString());
	    	return false;
	    }
	
		
	}

	
	//Switch Frames
	
	
	public boolean contacts()
	{
		// click on contacts button
		Driver.switchTo().frame("mainpanel");
		WebElement btn_contacts = Driver.findElement(By.xpath("//a[contains(@title,'Contacts')])"));
		btn_contacts.click();
		
		System.out.println("Contact button clicked");
		return true;
		
	}
	
}
