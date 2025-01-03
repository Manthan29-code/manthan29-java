package practice;
import java.util.Scanner;

public class Problem12 {
//	11. Replace All Occurrences of a Character:  
//	    Input: "hello world", 'l', '*'  
//	    Output: "heo wor*d"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter character which you want to replace:-");
		String subStr1 = sc.nextLine();
		System.out.println("Enter character by which you want to replace:-");
		String subStr2 = sc.nextLine();
		
		System.out.println("output "+ str.replace(subStr1, subStr2));
		
		
		

	}

}
