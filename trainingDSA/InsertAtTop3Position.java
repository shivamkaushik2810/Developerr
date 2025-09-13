import java.util.*;
class InsertAtTop{
    public void insertAtTop(){
        Stack st=new Stack();
        st.push(4);
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(12);
        st.push(20);
        System.out.println(st);
        int[] ar=new int[2];
        int top3 = (int) st.get(st.size() - 3);
        System.out.println("Element at top 3rd position: " + top3);
        st.add(st.size() - 2, 100); // Insert 100 at the 3rd position from the top
        System.out.println("After inserting 100 at top 3rd position: " + st);

    }
}

public class InsertAtTop3Position {
    public static void main(String[] args) {
        InsertAtTop t=new InsertAtTop();
        t.insertAtTop();
        
    }
    
}
