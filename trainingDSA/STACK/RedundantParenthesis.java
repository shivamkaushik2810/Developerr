
// opening braces -> push to Stack
//if operand -> leave it 
// operator -> push to stack 
// closing bracket -> start a while loop until we get an opening bracket.
// if we get operator in between then no redundant else redundant

import java.util.*;

class RedundantParenthesisCheck {

    public void doCheck() {
        String s = "(a+((b+c)))";
        Stack st = new Stack();
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                st.push(ch);
            } else {
                if (ch == ')') {
                    flag = 0;
                    while ((char) st.peek() != '(') {
                        char top = (char) st.peek();
                        if (top == '+' || top == '-' || top == '*' || top == '/') {
                            flag = 1;
                            break;
                        }
                        st.pop();
                    }//
                    st.pop();
                }
            }
        }//End of loop
        if (flag == 0) {
            System.out.println("Redundant Parenthesis");
        } else {
            System.out.println("Not Redundant");
        }

    }

}

  public class RedundantParenthesis {

    public static void main(String[] args) {
        RedundantParenthesisCheck obj = new RedundantParenthesisCheck();
        obj.doCheck();
    }
}
