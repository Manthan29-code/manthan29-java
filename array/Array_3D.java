package array;
import java.util.Scanner;
public class Array_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[][][] A= new int[1][2][2];
		System.out.println("Enter value in Array:-");
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				for (int k = 0; k< A[0][0].length; k++) {
					System.out.println("Enter value for a["+ i+ "][" + j + "]["+ k +  "] :- " );
					A[i][j][k]=sc.nextInt();
					
				}
				
			}
		}
		System.out.println("Array content");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				for (int k = 0; k< A[0][0].length; k++) {
					System.out.println(" a["+ i+ "][" + j +"]["+ k + "] :- " + A[i][j][k]);
					
				}
//				System.out.println();
				
			}
		}
		

	}

}
