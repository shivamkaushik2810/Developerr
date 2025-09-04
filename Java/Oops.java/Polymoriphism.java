class Parents{
    //@Overloaded
    void sum(int a){
        System.out.println("a is: " + a );
    }
    void sum(int a, int b){
        System.out.println(a+b);

    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
//@overriding
// This class extends Parents and can override the methods defined in Parents
class Child extends Parents{
    // This class can override the methods if needed
    // For example, we could have a different implementation of sum
    void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}




class Polymoriphism {
    public static void main(String[] args) {

        Parents p=new Parents();
        Child c=new Child();

        p.sum(10);
        p.sum(10, 20);  
        p.sum(10, 20, 30);
        c.sum(10, 20, 30, 40); // This will call the Child's sum method with four parameters
    }
}