package practice;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String that contain white space");
		String str=sc.nextLine();
		
		String answer=str.replace(" ", "");
		
		System.out.println("output " + answer);
		

	}

}
