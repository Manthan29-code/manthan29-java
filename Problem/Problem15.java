package practice;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter substring:-");
		String subStr = sc.nextLine();
		boolean key=str.contains(subStr);
		if(key)
		{	
			System.out.println(subStr + " is in "+ str);
		}
	

	}

}
