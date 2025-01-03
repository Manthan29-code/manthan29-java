package practice;
import java.util.Scanner;


public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter substring:-");
		String subStr = sc.nextLine();
		
		if(str.startsWith(subStr))
		{
			System.out.println("String starts with "+ subStr);
		}
		else if(str.endsWith(subStr))
		{
			System.out.println("String ends with" + subStr);
		}
		else
		{	
			System.out.println("string don't contain "+subStr+" as strting or endong string");
		}
		

	}

}
