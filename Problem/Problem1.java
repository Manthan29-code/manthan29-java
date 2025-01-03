package practice;
import java.util.Scanner;

public class Problem1 {
//	1. Reverse a String:  
//		   Input: "hello"  
//		   Output: "olleh"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str="abcdef";
//		System.out.println("initial value of str:- " + str);
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a new string :-");
//		str= sc.nextLine();
//		System.out.println("replaced  value of str:- " + str);
//		sc.close();		
		
		
		System.out.println("Enter value of str:-");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char []ch=str.toCharArray();
		
		System.out.println(ch);
		int i=0;
		int j=str.length()-1;
		char temp;
		while(i<=j)
		{	
		   temp=ch[i];
		    ch[i]=ch[j];
		    ch[j]=temp;
		    i++;
		    j--;
		
		}
		System.out.println("revers string= "  +  ch);
		 
	}

}
