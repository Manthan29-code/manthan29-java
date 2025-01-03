package abstopic;

abstract class Shape {

	String  color;
	
	// these are abstract methods
	abstract double area() ;
	public abstract String tostring(); 
	
	// abstract class cane have constructor
	
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color=color;
	}
	
	
	// this is a concrete method
	
	public String getColor() {
		return color;
	}
	
	

}
