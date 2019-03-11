package access_modifiers;

public class Access_Private_class_methods_using_Constuctor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Access_private_class_methods_using_inheritence obj = new Access_private_class_methods_using_inheritence();
		//obj.private_msg(); /// Compile time error, to accessing private class of variables
		

	}
	public void Access_Private_class_methods_using_Constuctor()	
	{
		private_class_access_A obj= new private_class_access_A();
		
		
	}

}
