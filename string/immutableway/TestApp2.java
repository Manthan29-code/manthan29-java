package string.immutableway;

public class TestApp2 {

    public static void main(String[] args) {
        String name_1 ="royal";
        String name_2= new String("royal");

        System.out.println("(name1 == name2)" + (name_1 == name_2));

        System.out.println("name_1.hashCode()" + name_1.hashCode());
        System.out.println("name_2.hashCode()" + name_2.hashCode());
        
        System.out.println("name1 Address : " + System.identityHashCode(name_1));
		System.out.println("name2 Address : " + System.identityHashCode(name_2));
	
    }
    
}
