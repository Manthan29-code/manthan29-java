package practice;

import java.util.Scanner;

public class Problem11 {
	
//	10. Find the First and Last Occurrence of a Character:  
//	    Input: "occurrence", 'c'  
//	    Output: First: 1, Last: 4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter character:-");
		String subStr = sc.nextLine();
		
		System.out.println("Fist: " + str.indexOf(subStr) );
		System.out.println("Last: "+ str.lastIndexOf(subStr));
	}

}
