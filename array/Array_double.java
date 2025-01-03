package Basic;
import java.util.Scanner;
public class  Array_double{

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sixe of array");
		int size = sc.nextInt();
		double[] a =new double[size];
		
		System.out.println("size of array is" + a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter for a[" + i +  "] :-" );
			a[i]=sc.nextDouble();
		}
		
		System.out.println("Array content:-");
		for (int i = 0; i < a.length; i++) {
			System.out.println("value for A[" + i +  "] is :-" + a[i]);
			
		}
		
		

	}

}
