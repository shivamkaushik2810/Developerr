// package Normal_Prog;
import java.util.Scanner;

public class star1 {

    void printStar1(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    
    void printHalfPyramid(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }

    void printHalfPyramidNumbers(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }

    void printStar2(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=n;j>i;j--) // OR j=0;j<n-i+1; j++
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void printCharPattern(int n) {
        int i, j,k=65;
        for (i = 65; i < 65+n; i++) {
            for (j = 65; j <=i; j++) {
                System.out.print((char)(k)+" "); // (print char)(j) to print A AB ABC ABCD
                k++;
            }
            System.out.println();
        }
    }

    void printHollowRect(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n+1;j++)
            {   
                if(i==1 || i==n || j==1 || j==n+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    void invRotHalfPyr(int n)
    {
        for(int i=1;i<=n;i++)
        {   //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"); // by adding space to the right of the star we can print the equilateral triangle of stars
            }
            System.out.println();
        }
    }

    void inverted_HalfPyramid_with_Decreasing_numbers(int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = n; j > i; j--) 
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    void inverted_HalfPyramid_with_increasing_numbers(int n)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=1;j<n-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    void floydsTriangle(int n)
    {
        int i,j,k=1;// k is only for counting
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    
    void Alternate_01_triangle(int n)
    {   int k=1;
        for(int i=1;i<=n;i++)
        {   
            if(i%2==0)
            {
                k=0;
            }
            else k=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k +" ");
                k=1-k; 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int choice;
    do{
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of lines:\t\t");
        int line= sc.nextInt();
        System.out.println();
        star1 s = new star1();
            s.printStar1(line);
        System.out.println();
            s.printHalfPyramid(line);
        System.out.println();
            s.printStar2(line);
        System.out.println();
            s.printHalfPyramidNumbers(line);
        System.out.println();
            s.printCharPattern(line);
        System.out.println();
            s.printHollowRect(line);
        System.out.println();
            s.invRotHalfPyr(line);
        System.out.println();
            s.inverted_HalfPyramid_with_Decreasing_numbers(line);
        System.out.println();
            s.inverted_HalfPyramid_with_increasing_numbers(line);
        System.out.println();
            s.floydsTriangle(line);
        System.out.println();
            s.Alternate_01_triangle(line);
        System.out.println("Do you Wish to continue ? press 1 for YES & 0 for NO");
        choice = sc.nextInt();
        sc.close();
    }while(choice==1);
        System.out.println("Thanks for trying it.");
    }
}
