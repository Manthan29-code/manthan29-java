package oops.classtopic;
import java.util.Scanner;

//class property  1) data member
//				   2) data function

	
public class Student {
	//data members
	int rno;
	int std;
	String name;
	double marks;
	
    // member function;
	public void ScanData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:-");
		name = sc.nextLine();
		System.out.println("Enter Rno");
		rno=sc.nextInt();
		System.out.println("Enter std");
		std= sc.nextInt();
		System.out.println("Enter marks");
		marks= sc.nextInt();
//		sc.close();
		
	}
	public void Display() {
		System.out.println(rno+" " + name+" " + std+" " + marks);

	}


}// class
