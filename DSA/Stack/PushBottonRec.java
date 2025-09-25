import java.util.*;
class PushAtBotton{
    public void pushAtBottam(Stack s,int data){
        Stack st=new Stack();
        st.push(1);
        st.push(2); 
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        while(!st.isEmpty()){
            int top=(int)st.pop();
            st.push(top);
        
        pushAtBottam(st,data);
        st.push(top);
        }


        


        
    }
}
public class PushBottonRec{
    
    public static void main(String[] args) {
        PushAtBotton p=new PushAtBotton();
        Stack s=new Stack();
        p.pushAtBottam(s,10);
    }
}