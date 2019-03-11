package com.naveen.testNG;

import org.testng.annotations.Test;

public class groupsAnnotation 

{
	
	@Test(groups="smokeTest",priority=1)
	public void loginPageTitleTest()
	{
		System.out.println("This is LoginTest");
	}

	@Test(groups="RegressionTest",priority=3)
	public void searchPageTest()
	{
		System.out.println("This is searchPageTest");
	}
	@Test(groups="LinkVerificationTest",priority=4)
	public void LinkTest()
	{
		System.out.println("This is LinkTest");
	}
	@Test(groups="smokeTest",priority=2)
	public void LogoutTest()
	{
		System.out.println("This is LogoutTest");
	}

}
