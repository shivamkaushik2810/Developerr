class A extends Thread{
    public void run(){
        for (int i=0;i<=10;i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            System.err.println("Thread Priority: " + Thread.currentThread().getPriority());

            
        }
    }
}
class ThreadPriority{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        // Setting thread names
        a1.setName("Thread A");
        a2.setName("Thread B"); 
        a3.setName("Thread C");

        // Setting thread priorities
        a1.setPriority(1); // 1
        a2.setPriority(10); // 5
        a3.setPriority(6); // 10

        // Starting threads
        a1.start();
        a2.start();
        a3.start();

       
        
    }
}