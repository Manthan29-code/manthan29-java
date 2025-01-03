package Basic;

//import java.util.Scanner;
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 45, 78 }, { 45, 92, 74 }, { 73, 94, 27 } }; // Array 1
		int[][] b = { { 45, 83, 65 }, { 64, 83, 75 }, { 18, 29, 79 } }; // Array 2

		int k = a.length;
		int l = a[0].length;

		int[][] c = new int[k][l]; // Array 3

		System.out.println();

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < l; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("Answer is :-");
		for (int[] a_ele : c) {
			for (int element : a_ele) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}
