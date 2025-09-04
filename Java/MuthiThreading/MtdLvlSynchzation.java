class Table{
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
          
}



}
Class A extends Thread{

    Table t;
    A(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}



class MtdLvlSynchzation {
    public static void main(String[] args) {
        Table obj = new Table();
        A t1 = new A(obj);
        A t2 = new A(obj);
        t1.start();
        t2.start();
    }
}