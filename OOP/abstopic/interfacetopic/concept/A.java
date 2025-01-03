package abstopic.interfacetopic.task1.concept;

public interface A {

    //1) constant variable--- [public static final]
    public int no= 10; // static final (compiler  will assign missing keyword)
   
    // 2)abstract method ----[public abstract]
    abstract void test1();// public
    public abstract void test2();
    
    //3) non Abstract Methods (private , default , static)

    // java -8
    static void test3(){
        System.out.println("A-static void test3()");
    }

    //java - 8
    default void test4()
    {
        System.out.println("A--- default method test4()");
        test5();
    }

    //java -9
    private void test5(){
        System.out.println("A--private test5()");
    }
    
}
