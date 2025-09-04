class TwoThread extends Thread {
    public  synchronized  void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running."    );
        for(int i=0;i<=10;i++   ){
            System.out.println("Infinite loop in " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        TwoThread t1 = new TwoThread();
        TwoThread t2 = new TwoThread();
        TwoThread t3 = new TwoThread();
        t1.start();
        t2.start();
        t3.start(); // This will cause a compilation error since t3 is not defined
    }
}