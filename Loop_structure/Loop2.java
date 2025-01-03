class Loop2{
         public static void main(String [] args)
	{
		int i=0, j=0;
		for(i=0;i<=5 ; i++)
		{
                 	for(j=0; j<=i ; j++)
			{
                		System.out.print("* ");
			}//inner for
			System.out.println();
		}//outer for

		System.out.println();
		i=1;
		do 
		{
			 j = 1;
			do 
			{
				//if(j<=i)
                                if(j>i)
				//System.out.print("*");
				System.out.print("*");
				else
				System.out.print(" ");
				j++;
				
			}while(j<=5);
			
			System.out.println();
			i++;
		}while(i<=5);
	}//args
}//class