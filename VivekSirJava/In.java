import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class In {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("Text1.txt"));

    }

}
