import java.util.*;

public class Locale {
    

   static  Locale locale;
   static void loadFiles(Locale locale){
    ResourceBundle rb;
    rb = ResourceBundle.getBundle("Messages", locale);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please press 1for english");
        System.out.println("कृपया हिंदी 2 के लिए प्री करें");
        System.out.println("日本語の場合は3を押してください");
        int langChoice = scanner.nextInt();
        
        if (langChoice == 1) {
       
            locale = new Locale("en", "US");
        } else if (langChoice == 2) {
            locale = new Locale("hi", "IN");
        } else if (langChoice == 3) {
            locale = new Locale("ja", "JP");
        } else {
            System.out.println("Invalid choice, defaulting to English.");
            locale = new Locale("en", "US");
        }

    }
    
}

    

