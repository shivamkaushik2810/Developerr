class throw1 {
    public static  int sum(int a,int b) throws ArithmeticException {
        int result = a / b; // This will throw ArithmeticException if b is 0
        return result;
    }
    public static void main(String[] args)  {    
        // This will throw an ArithmeticException immediately
        try {
            int result = sum(10, 0); // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Caught an ArithmeticException: " );
        }
    }
}
