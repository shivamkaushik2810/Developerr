class A extends Thread{
    public void run() {
        for(int i = 1; i <= 1000; i++) {
            System.out.println(i);
    }
}
}
class Test {
    public static void main(String[] args) {
        A thread = new A();
        A b=new A();
        thread.start();
        b.start();
        thread.start();
        b.start();
        B obj= new B();
        Thread obj1=new Thread(obj);
         obj1.start();
    }
}
class B extends Thread {
    @Override
    public void run() {
        System.out.println("Running in B");
         for(int i = 1; i <= 100000; i++) {
            System.out.println(i);
    }
    }
}