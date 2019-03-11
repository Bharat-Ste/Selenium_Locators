package Array_;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) 
	{
		
		
//1. simple interger Array voncept
		
		int b[] = new int[5];              // this is static array, size is fixed to five. to resolve this issue, we use collections.
		
		


//2. ArrayList wihout generics
		//Dynamic Array List
		//1. contains Duplicate value
		//2. mentions inserting order. 
		//3. it not synchronize
		//4. it allows the random access to fetch the element, because it stores the values on the basis of indexes.
		
		ArrayList a = new ArrayList();   // implements List interface, Dynamic Array.  , 
		a.add("bharat");
		a.add("sharat");
		a.add("geeta");
		System.out.println("size :" + a.size());
		a.remove(1);
		System.out.println("size :" + a.size()); 
		
		int i=0;
		while(i<a.size())
		{
			System.out.println("val is :" + a.get(i) );
			i++;
		}
		
		
		
 //3. How to store user defined user defined class variables in Array, create a Employee class and get data from ther
		
		//Create employee data
		
		Employee emp1 = new Employee("Bharat",20,"Sr.QA"); //call employee constructor
		Employee emp2 = new Employee("Iqbal",30,"Sr.QA"); //call employee constructor
		Employee emp3 = new Employee("Sandeep",40,"Jr.QA"); //call employee constructor
		
		
		ArrayList<Employee> a4=new ArrayList<Employee>(); // We did not use for loop here because we stored data inside 'Employee' Object
		a4.add(emp1);
		a4.add(emp2);
		a4.add(emp3);
		
		Iterator<Employee> it1 = a4.iterator();
		while(it1.hasNext())
		{
			Employee e = it1.next();
			System.out.println( e.name);
			System.out.println( e.age);
			System.out.println( e.dept);
		}
		
		
		
		
		

	}

}
