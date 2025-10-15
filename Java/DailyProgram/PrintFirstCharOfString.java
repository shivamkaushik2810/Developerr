public class PrintFirstCharOfString{
    public static void main(String[] args) {
        String str="Koii Mil Geya";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                if(i==0||str.charAt(i-1)==' '){
                    System.out.print(str.charAt(i));
                }
            }
        }
        
    }
}