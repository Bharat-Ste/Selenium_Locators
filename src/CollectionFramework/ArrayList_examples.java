package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_examples {

	public static void main(String[] args) 
	{
//		arrayListExample();
//		readArrayList_Itrator();
//		clone_arrayList();
//		Add_allElements_arrayList();
		checkElements();
	}
	/**
	  * Program:1 Basic ArrayList Operations.
	    Here we can see example for basic ArrayList operations like :- 
	    creating object for ArrayList, 
	    adding objects into ArrayList, 
	    accessing objects based on index, 
	    searching an object in ArrayList whether it is listed under this instance or not, 
	    adding elements at specific index, 
	    checking whether the ArrayList is empty or not, 
	    getting object index, and finally size of the ArrayList.
	 */
	public static void arrayListExample()
	{
		System.out.println();
		System.out.println("--------- arrayListExample() --------- ");
		System.out.println();
		ArrayList<String> ar = new ArrayList<String>();    //creating object for ArrayList,
		
		ar.add("maven");       							   //adding objects into ArrayList,
		ar.add("Joe");
		ar.add("lovesh");
		ar.add("manjila");
		ar.add("cristy");
		System.out.println(ar); 
		
		System.out.println(ar.get(2));                    //accessing objects based on index,
		
		System.out.println(ar.contains("cristy"));       //searching an object in ArrayList whether it is listed under this instance or not,
		System.out.println(ar.contains("devika")); 
		
		ar.add(0, "India");                              //adding elements at specific index, 
		System.out.println(ar.get(0)); 
		System.out.println(ar); 
		
		System.out.println("ArrayList empty or not Check :" + ar.isEmpty());  //checking whether the ArrayList is empty or not,
		
		
		System.out.println("Size of arrayList is : " +ar.size());// getting object index, and finally size of the ArrayList.
		System.out.println("Get index of lovesh is : " + ar.indexOf("lovesh"));

		
		ar.clear();   //How to delete all elements from my ArrayList?
		System.out.println(ar);
	}

	
	/**
	 * Program:2 How to read all elements in ArrayList by using iterator?
	 */
	
	public static void readArrayList_Itrator()
	{
		System.out.println();
		System.out.println("--------- readArrayList_Itrator() --------- ");
		System.out.println();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sabistain");
		ar.add("trap");
		ar.add("lohit");
		ar.add("ramma");
		ar.add("keshwa");
		
		Iterator<String> ir = ar.iterator();
		while(ir.hasNext())
		{
			System.out.println(" " + ir.next());
		}
		
	}

    /**
     * Program:3 How to copy or clone a ArrayList?
     * Here we can see example for creating duplicate object of an ArrayList instance. we can done this by using clone() function.
     */

	public static void clone_arrayList()
	{
		System.out.println();
		System.out.println("--------- clone_arrayList() --------- ");
		System.out.println();
		ArrayList<String> al= new ArrayList<String>();
		al.add("KTM");
		al.add("Ducati");
		al.add("Trimph");
		System.out.println("Original ArrayList size : " + al.size());
		System.out.println("Original arrayList  : " + al);
		
		System.out.println();
		ArrayList<String> al1= (ArrayList<String>) al.clone();
		
		System.out.println("Cloned arrayList size : " + al1.size());
		System.out.println("Cloned arrayList  : " + al1);
		
		
	}

   /**
    * Program:4 How to add all elements of a list to ArrayList?
    */

	public static void Add_allElements_arrayList()
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("b");
		al.add("c");
		System.out.println("al :" + al);
		
		List<String> li= new ArrayList<String>();
		li.add("bharat");
		li.add("Purvi");
		System.out.println("li : " + li);
		/**
		 * Add li LIST in Above al ArrayList
		 */
		
		al.addAll(li);
		
		System.out.println("li list added inside al arrayList :" + al);
	}
	
	
	/**
	 * Program:5 How to find does ArrayList contains all list elements or not?
	 */
	
	public static void checkElements()
	{
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		
		
		ArrayList<String> al2 = new ArrayList<String>();
//		al2.add("D");
//		al2.add("E");
		al2.add("A");
		al2.add("B");
		
		
		System.out.println("Does ArrayList al1 contains all list elements in al2 ?: " + al1.containsAll(al2));
		
		System.out.println("Does ArrayList al2 contains all list elements in al1 ?: " + al2.containsAll(al1));
	}
	
}
