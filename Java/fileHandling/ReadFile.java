import java.io.FileReader;
import java.io.IOException;
class ReadFile{
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("newfile.txt");
            try {
                int i;
                while ((i = f.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            } finally {
                f.close();
            }
            
            
        } catch (IOException e) {
            System.out.println("An error occurred while checking the file.");
           
        }
    }
}