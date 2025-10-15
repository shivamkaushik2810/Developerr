public class RemoveSpecialCharInString{
    public static void main(String[] args) {
        String str="rd@# engi$neering co%llege";
        String clean="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||ch==' '){
                clean=clean+ch;
            }
        }
        System.out.println(clean);
        
       
    }
}