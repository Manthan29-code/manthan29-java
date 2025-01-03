package Basic;

public class Sort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {45,92,8,56,83,94};
		
		System.out.println("Array befor sorting");
		for(int ele : A) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		int n=A.length;
		// sorting
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
			      if(A[j]> A[j+1]) {
			    	 int temp = A[j];
			    	 A[j]=A[j+1];
			    	 A[j+1]=temp;		    	 
			      }// if
			     }// inner
			}// outer
			
		
	   System.out.println("Array after sorting");
	   for(int ele : A) {
		System.out.print(ele + " ");
	   }

	}//main

}//class
