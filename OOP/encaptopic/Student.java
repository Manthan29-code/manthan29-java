package oops.encaptopic;
//Pure Encapsulation--Data safety--Data Secure
//Type of constructor

public class Student {
	
  private int rno;
  private String name;
  private int std;
  private double marks;
  
  //1) default constructor
  
  public Student() {
		// TODO Auto-generated constructor stub
 	 System.out.println("Default constructor ==>" + rno + "----" + name +"----" + marks);
 	 System.out.println("Start :: Default Constructor");
 	 rno=10;
		 name="manthan";
		 std=12;
		 marks=80;
		 System.out.println("EXIT :: Default Constructor");
	
	}
  
  //2) parameterised constructor
  public Student(int rno , String name ,int std , double marks) {
 	 System.out.println("Start :: Parameterised Constructor");
 	 this.rno=rno;
		 this.name = name;
		 this.std = std;
		 this.marks = marks;
		 System.out.println("EXIT :: Parameterised Constructor");
	
  }
  
 // 3) Copy Constructor	
	 public Student(Student s){
		System.out.println("START :: Copy Constructor");
		rno = s.rno;
		name = s.name;
		std = s.std;
		marks = s.marks;
	 	System.out.println("EXIT :: Copy Constructor");
	}
	 
	//  public--->2) setter and getters Methods way
	 
	// setters---Mutators
		public void setRno(int rno) 
		{
			this.rno = rno;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public void setStd(int std) 
		{
			this.std = std;
		}
		public void setMarks(double marks) 
		{
			this.marks = marks;
		} 
		
		// Getters --- to access data of object
		
		public int getRno() {
			return this.rno ;
		}
		
		public String getName() {
			return this.name ;
		}
		 
		public int getStd() {
			return this.std;
		}
		
		public double getMarks () {
			return this.marks ;
		}

		public void dispData() 
		{
			System.out.println(rno+" " + name+" " + std+" " + marks);
		}
}
