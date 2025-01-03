package practice;

import java.util.Scanner;

public class Problem18 {
//	17. Convert String to Integer and Vice Versa:  
//	    Input: "1234"  
//	    Output:  
//	    - Integer: 1234  
//	    - Back to String: "1234"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		String str=sc.nextLine();
		
		int number=Integer.parseInt(str);
		
		System.out.println("String to number-->" + number);
		
		String str2 = String.valueOf(number);
		
		System.out.println("number to string ----> " + str2);
		
		

	}

}
