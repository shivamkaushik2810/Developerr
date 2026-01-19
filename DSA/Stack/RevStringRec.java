//reverse a string using stack and using recursion


class RevrseAString{
    public void doRevString(String str){
        Stack st=new Stack();
       // String str="abcd";
        int idx=0;
        while(idx<str.length()){
            st.push(str.charAt(idx));//it will push each char into
            
            idx++;
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            char ch=(char)st.pop();
            sb.append(ch);
        }
        System.out.println(sb.toString());
        

}
}

public class RevStringRec{
    public static void main(String[] args) {
        RevrseAString p=new RevrseAString();
        p.doRevString("abcd");
    }
        
}