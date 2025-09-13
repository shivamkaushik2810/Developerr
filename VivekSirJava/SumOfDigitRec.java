//find the sum of the digit

public class SumOfDigitRec {
    static void sumDigit(int n){
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int sum = (n % 10) + (n / 10 == 0 ? 0 : sumDigitHelper(n / 10));
        System.out.println(sum);
        }

        static int sumDigitHelper(int n) {
            if (n == 0) {
            return 0;
            } 
            return (n % 10) + sumDigitHelper(n / 10);

    }
    public static void main(String[] args) {
        SumOfDigitRec.sumDigit(-1-2-3-4-5-6);
        
    }
    
}
