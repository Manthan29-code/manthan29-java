package practice;

import java.util.Scanner;

public class Problem8 {
//	7. Find Common Characters Between Two Strings:  
//		   Input: "hello" and "world"  
//		   Output: "lo"


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1= ");
		char[] str1=sc.nextLine().toCharArray();
		System.out.println("Enter string 2= ");
		char[] str2=sc.nextLine().toCharArray();
		
		
	
//		for (char c_1 : str1 )
//		{
//			for(char c_2 : str2)
//			{
//				if(c_1==c_2)
//				{
//					System.out.print(c_1);
//					break;
//				}
//			}
//		}
		System.out.println("common character");
		String answer="";
		for (char c_1 : str1 )
		{
			for(char c_2 : str2)
			{
				String check=String.valueOf(c_1);
				if(c_1==c_2 && !answer.contains(check))
				{
					answer = answer.concat(check);
					System.out.print(check);
					break;
					
					
				}
			}
		}
	}

}
