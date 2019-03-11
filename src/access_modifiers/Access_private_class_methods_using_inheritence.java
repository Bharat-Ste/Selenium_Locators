package access_modifiers;

public class Access_private_class_methods_using_inheritence extends private_class_access_A
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Access_private_class_methods_using_inheritence obj = new Access_private_class_methods_using_inheritence();
		obj.private_msg(); /// Compile time error, to accessing private class of variables
		

	}
	

}
