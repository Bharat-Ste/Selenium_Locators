package access_modifiers;

public class private_class_access_A 
{

	private int x =10;
	private void private_msg()
	{
		System.out.println("Private void method called");
	}
	
	public private_class_access_A()
	{
		System.out.println(x);
	}
	
}
