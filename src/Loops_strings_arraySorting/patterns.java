package Loops_strings_arraySorting;

public class patterns {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		int c=0;
//		int loopCount =16;
//		
//		for ( c= 0;c<=loopCount-1;c++)
//		{
//		   if (c==3 | c== 7 | c==11 )
//		   {
//			   System.out.println("*");
//		   }
//		   else
//		   {
//			   System.out.print("*");
//		   }
//		   
//		}
		
		
		
//		for(int i=0;i<=4-1;i++)
//		{
//			for(int j =0;j<=4-1;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
		/*
		 Print this pattern : 
		 
		 1
		 0 1
		 1 0 1
		 0 1 0 1
		 1 0 1 0 1 
		 
		 */
		
		int i;
		int j;
		for (i = 1 ;i<=6 ; i ++)
		{
			//System.out.print(" i values is :" + i);
			for(j=1;j<=i ;j++)
			{
				//System.out.print(" j values is :" + j);
				if((i+j)%2==0)
				{
//					System.out.println(" i + J value is, if block : " + (i + j));
					System.out.print("1 ");
				}
				else
				{  //System.out.println(" i + J value is, else block : " + (i + j));
					System.out.print("0 ");
				}
				
			}
			System.out.println("");
		}
		
		
		

	}

}
