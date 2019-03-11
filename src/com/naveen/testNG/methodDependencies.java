package com.naveen.testNG;

import org.testng.annotations.Test;

public class methodDependencies 
{
	@Test()
	public void loginPageTitleTest()
	{
		System.out.println("This is LoginTest");
		int i =9/0;   // check when login Failed, in this case below dependents methods skipped automatically.
	}

	@Test(dependsOnMethods="loginPageTitleTest")     // Here we created a dependency on LoginMethod
	public void searchPageTest()
	{
		System.out.println("This is searchPageTest");
	}
	

	@Test(dependsOnMethods="loginPageTitleTest")
	public void LogoutTest()
	{
		System.out.println("This is LogoutTest");
	}

}
