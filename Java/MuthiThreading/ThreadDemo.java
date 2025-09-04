class MuthiThreading extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
    }
}

class ThreadDemo { // Renamed from 'Thread'

    public static void main(String[] args) {
        MuthiThreading t1 = new MuthiThreading();
        MuthiThreading t2 = new MuthiThreading();

        t1.start(); // Start the first thread
        t2.start(); // Start the second thread
    }
}