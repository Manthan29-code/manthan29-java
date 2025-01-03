package practice;

import java.util.Scanner;

public class Problem14 {
//	13. Split a String into Words:  
//	    Input: "Java is fun"  
//	    Output: ["Java", "is", "fun"]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String that contain white space");
		String str=sc.nextLine();
		
		String[] answer=str.split("\\s");
		
		for(String ele : answer)
		{
			System.out.println(ele);
		}
		
		

	}

}
