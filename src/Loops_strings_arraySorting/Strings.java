package Loops_strings_arraySorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Strings 
{

	public static void main(String[] arg)
	{
		
		//concat();
		//getLength();
		//upperCase();
		//reverseString();
		//reverseString_m2();
		//splitStr();
		extractNumber_FromString();
		
		
	}

	
// Example 1: concatenation
	
	    public static void concat()
	{
		String s1,s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two stings values");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		String s3 = s1.concat(s2);
		String s4 = s1+s2;
		System.out.println("Result of concatenation is : "+ s3);
		System.out.println("Result of concatenation is : "+ s4);
	}
	
// Example 2: concatenation	
	
	    public static void getLength()
	{
		String s1,s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two stings values");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		System.out.println("S1 lenght is :" + s1.length());
		System.out.println("S2 lenght is :" + s2.length());
		 
		
	}

// Example 3: 	upper case
	
		public static void upperCase()
		{
			String s1,s2;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two stings values");
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			
			System.out.println("S1 lenght in upper case :" + s1.toUpperCase());
			System.out.println("S2 lenght in upper case :" + s2.toUpperCase());
			 
			
		}	

// Example 4: 	Reverse Method 1
		
		public static void reverseString()
			{
				String s1="bharat";
				String s2="";
				
				String s3="";
				System.out.println(s1.length());
				
				
				
				for(int i=s1.length()-1;i>=0;i--)
					
				{
					System.out.println(i);
					s2 = s2 + s1.charAt(i);
					

				}
				System.out.println("Original string S1 : "+ s1);
				System.out.println("Reverse string S2 : "+ s2);
				
				
				
				
				
			}		

		
// Example 5 : ReverseString Method 2 
		public static void reverseString_m2()
		{
			String s1="bharat";
			String s2="";
			
			String s3="";
			System.out.println(s1.length());
			
			StringBuffer sb = new StringBuffer(s1);
			s2 = sb.reverse().toString();
			
			System.out.println("Original string S1 : "+ s1);
			System.out.println("Reverse string S2 : "+ s2);
			
			
			
			
			
		}
		
// Example 6: 	Split String		
        public static void splitStr()
        {
        	String s = "bharat,mona,krishana,shraddha";
        	
        	System.out.println(s);
        	
        	String arr[]= s.split(",");
        	System.out.println(arr.length);
        	
        	System.out.println("value 1 is :" + arr[0]);
        	System.out.println("value 2 is :" + arr[1]);
        	System.out.println("value 3 is :" + arr[2]);
        	System.out.println("value 4 is :" + arr[3]);
        	
        	
        	for(String obj:arr)
        	{
        		System.out.println(obj);
        	}
        	
        }
		
        
        
// Example 7: Extract number from a string
        // 873bh%%a6++r1aT
        
        public static void extractNumber_FromString()
        {
        	
        	
        	String str="73bh%%a6++r1aT";
//        	System.out.println(str);
        	
        	str = convert(str);
  
        	System.out.println(str);
        	
        	
        }
        
        public static String convert(String str)   // Return Numeric values 
        {
        	StringBuffer sb = new StringBuffer(str);
        	
        	for(int i=0;i<sb.length();i++)
        	{
        		
               if(sb.charAt(i)<48 || sb.charAt(i)>57) //ASCI values for numbers between 48 - 57
               {
            	   sb.deleteCharAt(i);
            	   i--;

               }
        		
        	}
        	//System.out.println(sb.toString());
        	
        	return sb.toString();
        }
        
        public static String convert1(String str) // Return Non-Numeric values 
        {
        	StringBuffer sb = new StringBuffer(str);
        	
        	for(int i=0;i<sb.length();i++)
        	{
        		
               if(sb.charAt(i)<48 || sb.charAt(i)>57) //ASCI values for numbers between 48 - 57
               {
            	   

               }
               else
               {
            	   sb.deleteCharAt(i);
            	   i--;
            	   
               }
        		
        	}
        	System.out.println(sb.toString());
        	
        	return sb.toString();
        }
}
