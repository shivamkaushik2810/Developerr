import java.util.Stack;
class StackA{
    public void pushAtBottam(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottam(s, data);
        s.push(top);
    }
}
public class PushBottonRec{
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
    
            
        }
        }
    }
