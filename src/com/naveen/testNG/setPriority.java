package com.naveen.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class setPriority 
{
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		System.out.println("This is LoginTest");
	}

	@Test(priority=3)
	public void searchPageTest()
	{
		System.out.println("This is searchPageTest");
	}
	@Test(priority=2)
	public void LinkTest()
	{
		System.out.println("This is LinkTest");
	}
	@Test(priority=4)
	public void LogoutTest()
	{
		System.out.println("This is LogoutTest");
	}
}
