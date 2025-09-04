interface Test {
    void display();
}
class Test1 implements Test {
    public void display() {
        System.out.println("Display method from Test1");
    }
}
class Test2 implements Test {
    public void display() {
        System.out.println("Display method from Test2");
    }
}

class MltClass {
    public static void main(String[] args) {
        System.out.println("This is a multi-class example in Java.");
        Test t1 = new Test1();
        Test t2 = new Test2();  
        t1.display();
        t2.display();
        System.out.println("End of multi-class example.");
       // Test1 a= new Test1();
        //a.display();
    }
}