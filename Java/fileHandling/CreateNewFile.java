import java.io.File;
import java.io.IOException;
class CreateNewFile{
    public static void main(String[] args) {
        try {
            File f=new File("newfile.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
                System.err.println("File path: " + f.getAbsolutePath());
                System.err.println("File size: " + f.length() + " bytes");
                System.err.println("File writable: " + f.canWrite() );
                System.err.println("File readable: " + f.canRead());
                System.err.println("File executable: " + f.canExecute());   
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}