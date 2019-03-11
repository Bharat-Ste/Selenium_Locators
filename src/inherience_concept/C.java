package inherience_concept;

public class C extends A
{

	public static void Inherit_()
	{
		System.out.println("this is C-Class method");
	}
	
	public static void main(String[] args)
	{
		C obj = new C();
		obj.parentmenthod();
		obj.Inherit_();
	}
	
}
