package Prectice;

import java.util.HashMap;
import java.util.Map;

public class PrintFirstNonRepleted {

	public static void main(String[] args) 
	{
		
		
		String a="Morning";
		String str=a.toLowerCase();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			
			char check=str.charAt(i);
			if(map.containsKey(check))
			{
				int currCount=map.get(str.charAt(i));
				map.put(str.charAt(i), currCount+1);
			}
			else
			{
				map.put(str.charAt(i),1);
			}
			
		}
		System.out.println(map.toString());
		
		for(int j=0;j<str.length();j++)
		{
			char c = str.charAt(j);
			if(map.get(c)==1)
			{
				System.out.println(str.charAt(j));
				System.out.println( "value is : " + c);
				break;
			}
		}
		

	}

}
