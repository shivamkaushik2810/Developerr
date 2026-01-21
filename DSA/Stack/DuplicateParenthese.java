import java.util.Stack;
class Solution3{
    public  boolean dupParenth(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch==')'){//closing bracket
                int count=0;
                while(stack.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true; //duplicate found return true
                }
            }
            else{
                stack.push(ch);    //pushing opening bracket and other characters
            }   
        }
        return false;    //no duplicate found
    }
}
public class DuplicateParenthese {
    public static void main(String[] args) {
        String str = "(a+b)";
        Solution3 Solution3= new Solution3();
        System.out.println(Solution3.dupParenth(str));
    }
    
}
