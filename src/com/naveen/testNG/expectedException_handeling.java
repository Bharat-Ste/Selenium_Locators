package com.naveen.testNG;

import org.testng.annotations.Test;

public class expectedException_handeling 
{
	
//	@Test(timeOut=2000,expectedExceptions=NumberFormatException.class)
//	public void infiniteLoopTest()
//	{
//		int i=1;
//		while(i==1)
//		{
//			System.out.println("i : "+ i);
//		}
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String  x= "100A";
		Integer.parseInt(x);
		
		
	}

}
