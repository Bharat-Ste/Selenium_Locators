package Super_keyword_concept;

public class Father_class extends Grandfather_class {

	public static void main(String[] args) 
	{
		Father_class F_Obj = new Father_class();
		F_Obj.add();
		F_Obj.Access_GF_add();

	}
	public void Access_GF_add()
	{
		System.out.println("*********************");
		super.add();
		System.out.println("*********************");
	}

	public void add()
	{
		System.out.println("Father class Add()");
	}
}
