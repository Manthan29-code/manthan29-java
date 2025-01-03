package practice;

import java.util.Scanner;

public class Problem16 {
//	15. Find All Occurrences of a Substring:  
//	    Input: "banana", "ana"  
//	    Output: [1, 3]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter substring:-");
		String substr = sc.nextLine();
		
		for(int i=0 ; i<str.length() - substr.length(); i++)
		{
			if(str.charAt(i)==substr.charAt(0))
			{   int j;
				for(j=0 ; j<substr.length() ; j++)
				{
					if(str.charAt(i +j)!=substr.charAt(j)) {
						
						break;
					}
				}
				if(j==substr.length())
				{	
					System.out.print(i + " " );
				}

			}
				
		
		}
	}

}
