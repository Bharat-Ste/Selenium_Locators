package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import selenium_locators.popup_windowHandeling;

public class PropertiesFile 
{
	static Properties prop = new Properties();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		readProperties();

	}
	
	public static void readProperties()
	{
		
	    try 
	    {
			InputStream Istrm = new FileInputStream("/Users/bharat/eclipse-workspace/firstProject/src/config/config.properties");
			prop.load(Istrm);
			String val= prop.getProperty("browser");
			System.out.println("browser name : " +val);
			
			popup_windowHandeling.browser = val;
			
			
		} 
	    catch (Exception e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeProprtyFile()
	{
		

		try {
			OutputStream opst = new FileOutputStream("/Users/bharat/eclipse-workspace/firstProject/src/config/config.properties");
			prop.setProperty("browser", "Chrome");
			prop.setProperty("Name", "Bharat");
			prop.store(opst, null);
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
