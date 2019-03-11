package encapsulation;

public class write_only_class 
{

	//private data member  
	private String college; 
	
	//getter method for college  
	public void setCollege(String college)
	{  
	this.college=college;
	System.out.println("......."+ college);
	
	}
}
