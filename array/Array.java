package Basic;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sixe of array");
		int size = sc.nextInt();
		int[] a =new int[size];
		
		System.out.println("size of array is" + a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter for a[" + i +  "] :-" );
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array content:-");
		for (int i = 0; i < a.length; i++) {
			System.out.println("value for A[" + i +  "] is :-" + a[i]);
			
		}
		
		

	}

}
