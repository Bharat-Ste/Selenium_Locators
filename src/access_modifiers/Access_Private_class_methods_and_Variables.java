package access_modifiers;

public class Access_Private_class_methods_and_Variables 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Access_Private_class_methods_and_Variables cobj = new Access_Private_class_methods_and_Variables();
		
		private_class_access_A conj_A = new private_class_access_A();
		System.out.println(conj_A.x);   //Compile Time Error  
		conj_A.msg();					//Compile Time Error  

	}

}
