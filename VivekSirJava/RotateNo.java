public class RotateNo {
    public static int rotate(int n, int r) {
        int numDigits = (int)Math.log10(n) + 1;
        r = r % numDigits;
        if (r < 0) {
            r += numDigits;
        }
        int divisor = (int)Math.pow(10, r);
        int multiplier = (int)Math.pow(10, numDigits - r);
        int left = n / divisor;
        int right = n % divisor;
        return right * multiplier + left;
    }

    public static void main(String[] args) {
        int n = 12345;
        int r = 2;
        System.out.println(rotate(n, r)); // Output: 45123
    }
}