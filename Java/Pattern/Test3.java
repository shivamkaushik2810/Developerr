public class Test3 {
    public static void main(String[] args) {
         int i, j;
        
        // outer loop to handle rows
        for (i = 0; i <= 10; i++) {

            // inner loop to print spaces.
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print value of j.
            for (j = i; j <= 10; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
    }
    
/*
 1 2 3 4 5 6 7 8 9 10 
 2 3 4 5 6 7 8 9 10
  3 4 5 6 7 8 9 10
   4 5 6 7 8 9 10
    5 6 7 8 9 10
     6 7 8 9 10
      7 8 9 10
       8 9 10
        9 10
         10
 */
