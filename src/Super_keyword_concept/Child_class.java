package Super_keyword_concept;

public class Child_class extends Father_class
{

	public static void main(String[] args) 
	{
		Child_class C_obj = new Child_class();
		C_obj.add();
		C_obj.call_father_add();                          // Access Parent Class method, who have same method
		C_obj.Access_GF_add();                            // Access method of GrandFather class

	}
	public void call_father_add()
	{
		System.out.println("*********iii**********");
		super.add();                                        /// Super Keyword
		System.out.println("**********iii*********");
	}

	public void add()
	{
		System.out.println("This is Child Class Add ()");
	}
}
