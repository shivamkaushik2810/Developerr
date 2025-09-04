import java.io.*;

public class Out {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream("Text.txt"));// ouput can show in Text.txt file.without consile,screen
        System.out.println("shivam kaushik");

    }
}
