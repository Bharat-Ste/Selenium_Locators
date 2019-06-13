package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_shuffling {

	public static void main(String[] args) {
		suffle();

	}

	public static void suffle()
	{
		 ArrayList<String> obj = new ArrayList<String>();
	      obj.add("A");
	      obj.add("E");
	      obj.add("I");
	      obj.add("O");
	      obj.add("U");
	     
	      System.out.println("----- Before Suffeling --------");
	      System.out.println(obj);

	      /**
	       *   Use Collections.shuffle()
	       */
	      
	      Collections.shuffle(obj);
	      System.out.println("----- After Suffeling --------");
	      System.out.println(obj);

	}
}
