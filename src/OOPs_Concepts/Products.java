package OOPs_Concepts;

public class Products 
{

	public String name;
	public double price;
	public String skID;
	public int Qty;
	
	
	public void purchage(int qty)
	{
		
		System.out.println(name + " purchage() Qty is ::  " + qty); 
	}
	
	public double calculate_price(double qty)
	{
		System.out.println(" Calculated Price for quentity " + qty + " is ::" + price * qty);
		return (price*qty);
	}
	
}
