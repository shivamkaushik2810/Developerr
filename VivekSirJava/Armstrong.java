class ArmstrongA {
    public static void main(String[] args) {
        int num = 153; 
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, n);
            originalNum /= 10;
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    
}
