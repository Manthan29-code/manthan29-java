package practice;
import java.util.Scanner;

public class Problem5 {
//	4. Convert to Uppercase and Lowercase:  
//		   Input: "Java"  
//		   Output:  
//		   - Uppercase: "JAVA"  
//		   - Lowercase: "java"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str=sc.nextLine();
		System.out.println("Uppercase String = " + str.toUpperCase());
		System.out.println("Lower String = " + str.toLowerCase());
		
		

	}

}
