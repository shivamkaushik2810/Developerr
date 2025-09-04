import java.io.*;
class WriteOnFile{
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("newfile.txt");
            try {
                f.write("This is a new file created by Java.\n");
                f.write("This file is used to demonstrate file writing in Java.\n");
                f.write("End of file writing example.\n");
                
            } 
            finally {
                f.close();
                System.out.println("File written successfully.");

            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
          
            
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
       
    }
           
}