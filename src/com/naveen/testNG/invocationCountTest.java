package com.naveen.testNG;

import javax.swing.plaf.synth.SynthStyleFactory;

import org.testng.annotations.Test;

public class invocationCountTest 
{
	@Test(invocationCount=3)
	public void sum()
	{
		int a=10;
		int b=30;
		int c = a+b;
		System.out.println("Sum is  :" + c);
	}
	
	
	//Note ::  If you want to run above test 20 times, then you have to use 'invocationCount' annotation

}
