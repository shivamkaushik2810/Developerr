class Table{
    public void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
          }
}
class ThreadA extends Thread {

    Table t;
    ThreadA(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}
class ThreadB extends Thread {
    Table t;
    ThreadB(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(100);
    }
}



class MtdLvlSynchzation {
    public static void main(String[] args) {
        Table obj = new Table();
        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);
        t1.start();
        t2.start();
    }
}