public class Test2 {
    public static void main(String[] args) {
        int i, j;

        // outer loop to handle rows
        for (i = 10; i >= 1; i--) {

            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (j = 0; j <= 10 - i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        
        
    }
    
}
}
/*
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
 */
