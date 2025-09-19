

public class FnParameter{
    public static int  sum(int n,int m){
        return n + m;

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = sum(a, b);
        System.out.println("Sum is: " + result);
    }
}