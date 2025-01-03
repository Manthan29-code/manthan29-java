package practice;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("value of str:- ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		
		
		int i=0;
		int  j= str.length()-1 ;
		boolean flage =false;
		while(i<=j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{	
				System.out.println("String is not a palindrne");
				flage = true;
				break;
				
			}
			i++;
			j--;
		}
		if(!flage)
		{	
			System.out.println("Palindron String");
		}
	

	}

}
