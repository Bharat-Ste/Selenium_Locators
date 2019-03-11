package inherience_concept;

public class B extends A
{

	public void childClass()
	{
		System.out.println("This is child class method");
	}
	
	public static void main(String[] args)
	{
		B obj = new B();
		obj.childClass();
		obj.parentmenthod();

	}
}
