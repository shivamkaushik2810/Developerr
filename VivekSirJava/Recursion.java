public class Recursion {
    static void printData(int n){
        if(n==5){
            return;
        }
        System.out.println("java");
        printData(n+1);
    }
     static void printData2(int n){
        if(n==0){
            return;
        }
        System.out.println("javaD");
        printData2(n-1);
    }
    public static void main(String[] args) {
       // Recursion.printData(10);
        Recursion.printData2(12);
        

        
    }
    
}
