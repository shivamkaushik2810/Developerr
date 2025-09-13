// write a program to insert an element at the bottom of the stack
import java.util.*;
class InsertAtBottom1{
      public void doInsertAtBottom(){
             Stack st=new Stack();
        st.push(45);
        st.push(23);
        st.push(27);
        st.push(21);
        st.push(11);
        st.push(17);
        st.push(10);
        System.out.println(st);
        int[] ar=new int[st.size()];
        int j=0;
        while(!st.isEmpty()){//isEmpty return true then stack is empty..! operater can  convert true into false
            int top=(int)st.peek();
            ar[j]=top;
            j++;
            st.pop();
            
      }
      System.out.println(st);
      st.push(100);//it will insert at bottomf
      for(int i=j-1;i>=0;i--){
          st.push(ar[i]);
      }
      System.out.println(st);
      
        }

   
}
    
 
public class InsertAtBottom
{
	public static void main(String[] args) {
	InsertAtBottom1 p=new InsertAtBottom1();
	p.doInsertAtBottom();
		
	}
}