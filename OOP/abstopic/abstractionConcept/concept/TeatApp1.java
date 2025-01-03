package abstopic.abstractionConcept.concept;

public class TeatApp1 {

    public static void main(String[] args) {
       // Upcasting --->Polymorphic Object
      //  referenc parent class --> obj of child class
        A obj = new b();

        obj.test();
        obj.test2();

        //obj.test3();// C.E
        if(obj instanceof b){
            // Downcasting
            // b objb= new b();
            // objb.test3();
            
            // Downcasting
            ((b)obj).test3();
        } 
       

    }
    
}
