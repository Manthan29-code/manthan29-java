import java.util.Scanner;
class Floyd{
	public static void main(String... args){
		Scanner sc= new Scanner(System.in);
                int i =0 , j=0;
		int count =1;
                int row = 5;
		for (i=0 ; i<=row ; i ++){
			for (j=0 ; j<=i ; j ++){
				System.out.print(count);
			         count ++;
			}//outer loop
			System.out.println();
		}//outer loop
                sc.close();
	}//main
}//class