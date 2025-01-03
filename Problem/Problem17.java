package practice;

import java.util.Scanner;

public class Problem17 {
//	16. Convert a String to a Character Array and Vice Versa:  
//	    Input: "hello"  
//	    Output:  
//	    - Character Array: ['h', 'e', 'l', 'l', 'o']  
//	    - Back to String: "hello"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String str=sc.nextLine();
		
		char [] strchar=str.toCharArray();
		System.out.println("String to char array");
		for(char ch : strchar)
		{
			System.out.print(ch + " ");
		}
		System.out.println();
		
		String str2=String.valueOf(strchar);
		
		System.out.println(" back to String ----> " + str2);

	}

}
