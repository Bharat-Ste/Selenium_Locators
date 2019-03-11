package OOPs_Concepts;

public class ProductTests 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Products IPhone = new Products();
		IPhone.name = "IPhone-X";
		IPhone.price = 199.00;
		IPhone.skID = "USKSUD";
		IPhone.Qty = 6;
		
		IPhone.purchage(6);
		IPhone.calculate_price(6);
		
		

	}

}
