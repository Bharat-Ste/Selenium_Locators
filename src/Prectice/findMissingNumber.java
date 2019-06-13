package Prectice;

import java.util.Arrays;

public class findMissingNumber {

	public static void main(String[] args) 
	{
		
		int a[] = {1,2,4,5,6}; 
		int miss = getMissingNo(a,5); 
		System.out.println(getMissingNo(a,5)); 

	}
    public static int getMissingNo(int a[],int n)
    {
    	int i,total;
    	total =(n+1)*(n+2)/2;
    	for(i=0;i<n;i++)
    	{
    		System.out.println("before total :" + total);
    		total -=a[i];
    		System.out.println("after total :" + total);
    		
    	}
    	
    	return total;
    }
	
	

}
