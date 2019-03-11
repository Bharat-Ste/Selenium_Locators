package WrapperClassConcept;

public class WrapperClassConcept {

	
	public static void main(String[] args) 
	{


// String to Integer conversion
		String x= "100";
		System.out.println( x + 20 );
		int i = Integer.parseInt(x); // Data conversion from staring to integer, Integer is Wrapper classes
		System.out.println( i + 20 );
		
//Integer,Double and Boolean
		
		String x1="12.23";
		double a= Double.parseDouble(x1);
		System.out.println(a+3.2);
		
// Boolean 
		String k="true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
	
		
// Integer to String conversion
		
		int j =200;
		String s= String.valueOf(j);
		System.out.println(s+' ' + 30);
		
		
//Try to convert AlphaNumeric string to Integer
		String v = "100B";
		int v1= Integer.parseInt(v); // NumberFormatException.forInputString,  For input string: "100B"
		System.out.println(v1);
		
		
	}
}
