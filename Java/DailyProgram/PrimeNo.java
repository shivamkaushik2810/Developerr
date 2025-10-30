
import java.util.*;
 class PrimeNoo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    boolean isprime =true;
    if(n==2)
    { 
        System.out.println("prime number");
    }
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            isprime=false;

        }
       
    }
     if(isprime)
        {
         System.out.println("prime number");
        }
        else
        {
            System.out.println("not prime");
        }
  } 
}
