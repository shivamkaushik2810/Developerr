//write a program to delete an element from the middle of the stack
import java.util.*;
class DeleteMidElement1{
    public void doDelete(){
        Stack st=new Stack();
        st.push(45);
        st.push(23);
        st.push(27);
        st.push(21);
        st.push(11);
        st.push(17);
        st.push(10);
        System.out.println(st);
        int mid=st.size()/2;
        System.out.println(mid);
        int[] ar=new int[mid];
        int j=0;
        //mid=3;
        for(int i=1;i<=mid;i++){
            int top=(int)st.peek();
            ar[j]=top;
            j++;
            st.pop();
            
            
        }
        st.pop();//it will delete the mid element
        for(int i=j-1;i>=0;i--){
            st.push(ar[i]);
        }
        System.out.println(st);
    }
}
public class DeleteMidElement
{
	public static void main(String[] args) {
	DeleteMidElement1 p=new DeleteMidElement1();
	p.doDelete();
	}
}


