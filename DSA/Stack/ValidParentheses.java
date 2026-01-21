import java.util.Stack;
class Solution1 {


    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch=='(' || ch=='{' || ch=='[') {     //opening brackets
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){      //if stack is empty and closing bracket comes
                    return false;
                }
                
                if ((stack.peek()=='(' && ch==')')         //matching pairs ()
                     || (stack.peek()=='{'&&ch=='}')       //matching pairs {}
                    || (stack.peek()=='['&&ch==']')) {      //matching pairs []
                    stack.pop();
                }
                else{
                    return false;
                    
                }
            }
        }
                
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(Solution1.isValid(str));
    }
    
}
