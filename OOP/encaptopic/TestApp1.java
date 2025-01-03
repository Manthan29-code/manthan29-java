package oops.encaptopic;


public class TestApp1 {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// Default constructor
		Student s1= new Student();
		//Parameterized constructor
		Student s2= new Student(3 , "Manthan" ,9 , 88.57);
		
		// copy constructor
		
		Student s3= new Student(s2);
		
		s1.setRno(s2.getRno());
		s1.setName(s2.getName());
		s1.setStd(s3.getStd());
		s1.setMarks(s3.getMarks());
		
		System.out.println("Display Data of s1");
		System.out.println("Display address of s1===> " + s1);
		s1.dispData();
		System.out.println("Display address of s2===> " + s2);
		System.out.println("Display Data of s2");
		s2.dispData();
		System.out.println("Display address of s3===> " + s3);
		System.out.println("Display Data of s3");
		s3.dispData();
		
		// let's change data of s3 
		System.out.println("let's change data of s3 ");
		s3.setRno(4);
		s3.setMarks(87.67);
		s3.setName("Mohan");
		s3.setStd(10);
		System.out.println("Display address of s3===> " + s3);
		System.out.println("Display Data of s3");
		s3.dispData();
		
		
 		
	}

}
