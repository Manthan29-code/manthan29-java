package practice;
import java.util.Scanner;
public class Problem7 {
//	6. Compare Two Strings (equals & compareTo):  
//		   Input: "apple" and "Apple"  
//		   Output:  
//		   - Equals: false  
//		   - EqualsIgnoreCase: true  
//		   - compareTo: positive/negative

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1= ");
		String str1=sc.nextLine();
		System.out.println("Enter string 2= ");
		String str2=sc.nextLine();
		
		System.out.println("string 1= " + str1);

		System.out.println("string 2= " + str2);
		
		System.out.println("Equals -->" + str1.equals(str2));
		System.out.println("EqualsIgnoreCase -->" + str1.equalsIgnoreCase(str2));
		System.out.println("compareTo -->" + str1.compareTo(str2));
	}

}
