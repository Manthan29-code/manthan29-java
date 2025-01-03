package practice;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a word");
		   String str=sc.next();
		   System.out.println("First : "+ str.charAt(0));
		   System.out.println("last : "+ str.charAt(str.length()-1));
		   sc.close();
		   
		   String new_str = str.replace(str.charAt(0), str.charAt(str.length()-1));
		    System.out.println("new_str:- " + new_str);
		   
		   System.out.println("Displaying all charecter");
		   for (int i =0 ; i <str.length(); i++)
		   {
			   System.out.println(str.charAt(i));
		   }
		   
		   

	}

}
