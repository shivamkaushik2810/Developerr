import java.util.Stack;

public class ReverseStackUsingRec {
    static class StackA{
        public void pushAtBottom(Stack<Integer> s, int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtBottom(s, data);
            s.push(top);
        }
        public void reverseStack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            reverseStack(s);
            pushAtBottom(s, top);
        }
        public void printStack(Stack<Integer> s){
            while(!s.isEmpty()){
                System.out.println(s.pop()+" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
    StackA sa=new StackA();
     sa.printStack(s); 
    sa.reverseStack(s);
    sa.printStack(s);
    }
}
