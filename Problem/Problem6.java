package practice;
import java.util.Scanner;
	
public class Problem6 {
//	5. Count the Occurrence of a Character:  
//		   Input: "banana", 'a'  
//		   Output: 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of string");
		
		String str=sc.nextLine();
		System.out.println("Enter value of character");
		
//		String ch=sc.next();
		char ch=sc.nextLine().charAt(0);
		
		String new_str=str.replace(String.valueOf(ch) , "");
		
		System.out.println("value of String" + str );
		System.out.println(" value of character" + ch );
		System.out.println("count----->" + (str.length()-new_str.length()));
		
		
		
		
		
		
		

	}

}
