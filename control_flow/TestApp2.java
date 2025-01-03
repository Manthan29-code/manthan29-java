import java.util.Scanner;

class TestApp2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no ");
		int no= sc.nextInt();
		if(no > 0) 
		{
			// trueBased Statements
			System.out.println("No. is Positive : " + no);
		}else 
		{
			// falseBased Statements
			System.out.println("No. is Negative : " + no);
		}
		sc.close();
	}//main
}//class