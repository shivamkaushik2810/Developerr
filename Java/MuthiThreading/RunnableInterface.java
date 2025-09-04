class  A implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread A: " + i);
        }
        }
    } 


class RunnableInterface{
    public static void main(String[] args) {
        A a=new A();
        Thread t1=new Thread(a);
        t1.start();
        for(int i=0;i<=10;i++){//this is the main thred
            System.out.println("Thread B: " + i);
        }
        
    }
}