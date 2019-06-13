package CollectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convert_Array_To_collection {

	public static void main(String[] args) throws Exception 
	{
		DynamicArray_to_list();
		staticArray();
		
	}
	
	/**
	 * USE BufferedReader for reading array from console
	 * @throws Exception  
	 */
	public static void DynamicArray_to_list() throws Exception 
	{
		  System.out.println("DynamicArray_to_list() ---- Methods ");
		  BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("How many elements you want to add to the array: ");
	      int n = Integer.parseInt(in.readLine());
	      String[] name = new String[n];
	      
	      for(int i = 0; i < n; i++) 
	      {
	         name[i] = in.readLine();
	         System.out.println("Insidie Array : " + name[i]);
	      }
	      
	      List<String> list = Arrays.asList(name); 
	      System.out.println();
	      
	      for(String li: list) 
	      {
	    	  System.out.println("Inside List : " + li);

	      }
		System.out.println("---------------------------------------------------");
	}
	
	public static void staticArray()
	{
		System.out.println("staticArray() ---- Methods ");
		String[] students= {"bharat","sharat","ram"};     // Array of students
		System.out.println(students.length);
		for(String i:students)
		{
			System.out.println(i);
		} 
		
		List<String> list_students =  Arrays.asList(students);    // Concert array  to List
		System.out.println(list_students.size());
		for(String j:list_students)
		{
			System.out.println(j);
		}
	}

}
