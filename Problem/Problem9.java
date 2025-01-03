package practice;
import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. Extract a Substring:  
//			   Input: "programming", start = 3, end = 7  
//			   Output: "gram"
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter starting index:-");
		int start = sc.nextInt();
		System.out.println("Enter ending index:-");
		int end = sc.nextInt();
		
		String answer=str.substring(start ,end);
		
		System.out.println("answer " + answer);
		
		
	}

}
