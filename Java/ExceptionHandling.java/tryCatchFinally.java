class tryCatchFinally {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int c=10/5;
            int result = 10 / 0; // This will throw ArithmeticException
            System.err.println("c: " + c);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("This is the finally block, executed regardless of exception.");
        }
    }
}