
import java.util.*;
public class UsingCollectionFW {
public static void main(String[] args) {
    Stack st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    while(!st.isEmpty()){
        System.out.println(st.peek());
        st.pop();
    }
    
}

    
}
