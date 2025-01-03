import java.util.Scanner;

// simple if				
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.:- ");
		int no=sc.nextInt();
		if(no>0)
		{
		System.out.println("Number is positive  " + no);
		}
		sc.close();
	}//main
}//class