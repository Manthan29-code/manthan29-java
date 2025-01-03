package oops.classtopic;

public class TestApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating instanc of student
//		Student s1=new Student();
//		Student s2=new Student();
//		Student s3=new Student();
//		Student s4 =s3;
		Student s[]=new Student[3];
		
//		System.out.println("s1==> " + s1);
		//to know about class of object
//		System.out.println("s1.getClass() " + s1.getClass()); 
//		System.out.println("s2==> " + s2);
//		System.out.println("s3==> " + s3);
//		System.out.println("s4==> " + s4);
		System.out.println("s6==>"  + s);
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new Student();
			s[i].ScanData();
			
		}
		
		for (int i = 0; i < s.length; i++) {
			s[i].Display();
			
		}
		
	}

}
