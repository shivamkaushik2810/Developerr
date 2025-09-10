
import java.util.Scanner;

public class CountWord2 {
    public static void main(String[] args) {
        
        String name="";
        Scanner sc=new Scanner("i am       shivam kaushik");
        int wordCount =0;
        while(sc.hasNext()){
            wordCount++;
            System.out.println(sc.next());
          

            
        }
        System.out.println(wordCount);
    }
    
}
