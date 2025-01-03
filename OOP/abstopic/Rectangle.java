package abstopic;

public class Rectangle extends Shape {
	double length;
	double width;
	
	public Rectangle(String color , double length , double width) {
		super(color);
		System.out.println("rectangel constructor call");
		this.length = length;
		this.width= width;
	}
	
	@Override 
	double area() {
		return length*width;
	}
	@Override 
	public String tostring()
	{
		return "Rectangle color is " + super.getColor() + 
				"and area is " + area();
	}
	

}
