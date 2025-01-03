package practice;

import java.util.Scanner;

public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		19. Count Words in a Sentence:  
//		    Input: "Java is fun and easy"  
//		    Output: 5 words
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		
		String[]  strarray=str.split("\\s");
		
		System.out.println("Number of words --->" + strarray.length);
		
		

	}

}
