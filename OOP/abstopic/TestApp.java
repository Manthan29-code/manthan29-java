package abstopic;


public class TestApp {
public static void main(String... args) {
		
		Shape s1 = new Circle("red" , 2.2 );
		Shape s2 =new Rectangle("black" , 45, 73);
		
		System.out.println(s1.tostring());
		System.out.println(s2.tostring());
	}

}
