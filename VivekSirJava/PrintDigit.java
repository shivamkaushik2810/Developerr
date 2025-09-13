public class PrintDigit {
    static void printNo(int n){
        if (n==0) {
            return;
            
        }
       // System.out.println(n);//5 4 3 2 1 
        printNo(n-1);
        System.out.println(n);//1 2 3 4 5
    }
    public static void main(String[] args) {
        PrintDigit.printNo(5);
        
    }
    
}
