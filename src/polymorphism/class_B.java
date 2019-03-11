package polymorphism;

public class class_B extends class_A
{

	void run()
	{
		System.out.println("This is  class_B Run() method");
	}
	
	public static void main(String[] args)
	{
		class_A obj = new class_B(); // upcasting
		obj.run();
		
		class_B obj_b = new class_B();
		obj_b.callClassA_run();
	}
	public void callClassA_run()
	{
		super.run();
	}
	
}
