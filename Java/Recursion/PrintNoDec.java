public  class PrintNoDec{
    public static void printDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);//5 4 3 2 1 
        printDec(n-1);
        System.out.println("Back to "+n); //Back to 1 2 3 4 5
    }
    public static void main(String[] args) {
        int n=5;
        printDec(n);
        
    }
}