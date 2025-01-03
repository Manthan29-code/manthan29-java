package practice;

import java.util.Scanner;

public class Problem19 {
	
	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		char[] strchar=str.toCharArray();
		
		for(int i=0 ; i<strchar.length  ; i++)
		{	
			for(int j =0 ;j<strchar.length - 1 - i ; j++ )
			{
				if(strchar[j+1]< strchar[j])
				{
					char temp=strchar[j+1];
					strchar[j+1]= strchar[j];
					strchar[j]=temp;
				}
			}
		}
		
		String answer=String.valueOf(strchar);
		
		System.out.println("Sorted string---> " + answer);
		
	}

}
