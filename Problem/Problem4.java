package practice;
import java.util.Scanner;
public class Problem4 {
//	3. Count the Number of Vowels and Consonants:  
//		   Input: "programming"  
//		   Output: Vowels: 3, Consonants: 8

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value of str:-");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		
		System.out.println("str-->"+ str);
		
		int Vowels=0;
		for (int i=0 ;i<str.length() ; i++)
		{
			if(str.charAt(i)== 'a' ||
		       str.charAt(i)== 'e' ||
		       str.charAt(i)== 'i' ||
		       str.charAt(i)== 'o' ||
		       str.charAt(i)== 'u' )
			{
				Vowels++;
			}		
						
		}
		
		System.out.println("Vowels-->"+ Vowels);
		System.out.println("Consonants-->"+ (str.length()- Vowels));
		
	    
		

	}

}
