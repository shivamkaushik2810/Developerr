public class FnFactorial {
     static void printFact(int n){
        int  fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);

    }
    static int findFact(int n){
        int  fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;

    }
    public static void main(String[] args) {
        
        
        printFact(5);
        int c=findFact(5);
        System.out.println(c);


        
    }
    
}
