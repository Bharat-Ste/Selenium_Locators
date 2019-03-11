package com.naveen.hashmap;

import java.util.HashMap;

public class data {
 
	public static HashMap<String, String> getUserLoginInfo()
	{
	   HashMap<String, String>  userMap = new HashMap<String, String>();
	   userMap.put("admin", "mac_user_admin~123456");
	   userMap.put("teacher", "mac_user~123456");
	   return userMap;
	}
	
	public static HashMap<String, String> monthMap()
	{
		HashMap<String,String> monthMap = new HashMap<String, String>();
		monthMap.put("1", "January");
		monthMap.put("2", "February");
		monthMap.put("3", "March");
		monthMap.put("4", "April");
		monthMap.put("5", "May");
		monthMap.put("6", "June");
		monthMap.put("7", "July");
		monthMap.put("8", "Audust");
		monthMap.put("9", "Sepetember");
		monthMap.put("10", "October");
		monthMap.put("11", "November");
		monthMap.put("12", "December");
		
		return monthMap;
	}
	
	public static HashMap<String, String> dayMap()
	{
		HashMap<String, String> dayMap= new HashMap<String, String>();
		dayMap.put("1", "Monday");
		dayMap.put("2", "Tuesday");
		dayMap.put("3", "Wednesday");
		dayMap.put("4", "Thrusday"); 
		dayMap.put("5", "Friday");
		dayMap.put("6", "Saturday");
		dayMap.put("7", "Sunday");
		
		return dayMap;
	}
	 
	

}
