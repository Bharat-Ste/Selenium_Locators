package Loops_strings_arraySorting;

import java.util.Arrays;

public class array_sorting 
{

	// input  : [4,3,1,6,4,3,6,4]
	// output : [4,4,4,3,3,6,6,1]
	
	
	/*
	 * step 1: Sort the array [1,3,3,4,4,4,6,6]
	 * step 2: Create a 2-D Array list
	 * 1 1
	 * 3 2
	 * 4 3
	 * 6 2
	 * step 3: Sort above created 2D array in descending order.
	 * 4 3
	 * 3 2
	 * 6 2
	 * 1 1
	 * 
	 * Step 4: Print the elements in 2D array.
	 * [4,4,4,3,3,6,6,1]
	 * 
	 * 
	 */
 
	static int x=0;
	
	public static void main(String[] args)
	{

		int a[]= {4,3,1,6,4,3,6,4};
		int b[][] = new int[a.length][2];
		
		a = sort(a);
		System.out.println(a);
		
	
		b[x][0]  = a[0] ;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				b[x][1]=b[x][1]+1;
			}
			else
			{
				x++;
				b[x][0]=a[i];
			}
		} 
		
		x++;
		b=sort(b);
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<=b[i][1];j++)
			{
				 System.out.print( " " + b[i][0]);
			}
		}
		System.out.println("");
		
	}
	
	public static int[][] sort(int b[][])
	{
		int c[] = new int[2];
		
		for(int i=0;i<x;i++)
		{
			for (int j=i;j<x;j++)
			{
				if(b[i][1]<b[j][1])
				{
					 c=b[i];
					  b[i]=b[j];
					  b[j]=c;
					  
				}
			}
		}
		
		
		
		return b;
		
	}
	
	public static int[] sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					 int t;
					 t=a[i];
					 a[i]=a[j];
					 a[j]=t;
				}
			}
		}
		return a;
	}
	
	
}
