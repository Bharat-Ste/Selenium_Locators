package interfaces_concept;

public class excel implements Msoffice 
{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("This is excel Open() method");
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("This is excel write() method");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("This is excel  save() method");
	}

}
