package com.naveen.testNG;

import org.testng.annotations.Test;

public class exceptionTimeOutTest 
{

	//NOTE : to prevent infinite Loop, we use timeOut annotation to specify the time for particular test
	@Test(timeOut=2000)
	public void infiniteLoopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println("i : "+ i);
		}
	}
}
