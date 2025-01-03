package practice;

import java.util.Scanner;

public class Problem21 {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		String answer="";
		
		for(int i= 0 ; i<str.length() ; i++)
		{
			String temp=String.valueOf(str.charAt(i));
			if(answer.contains(temp))
			{	
				continue;
			}
			answer = answer.concat(temp);
		}
		
		System.out.println("answr---> " + answer);
	}
}
