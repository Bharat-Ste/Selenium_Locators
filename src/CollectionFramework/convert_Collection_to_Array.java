package CollectionFramework;

import java.util.ArrayList;

public class convert_Collection_to_Array {

	public static void main(String[] args) 
	{
		ArrayList<String> li= new ArrayList<String>();
		li.add("1");
		li.add("2");
		li.add("3");
		li.add("4");
		li.add("5");
		System.out.println("List size : "+  li.size());
        for(String i:li)
        {
        	System.out.println(i);
        }
        System.out.println("-----------");
       
        
        
        /**
         *  Convert List to Array
         */
        
        String arr[]=li.toArray(new String[0]);
        arr[0]="10";
        System.out.println("Array size : "+  arr.length);
        for(String j:arr)
        {
        	System.out.println(j);
        }
		
       
		
	}

}
