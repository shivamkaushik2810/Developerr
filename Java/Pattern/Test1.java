public class Test1 {
    public static void main(String[] args) {
         for (int i = 1; i <= 10; i++) {
            
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // outer loop to handle lower part
        for (int i = 10-1; i >= 1; i--) {
            
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
      
        
    }
}
/*
 * 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
 */