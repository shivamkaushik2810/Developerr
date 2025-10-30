

class Node{
    int no;
    Node prev;
}
class MyStack{
    Node top=null;
    public void push(int no){
        Node p=new Node();
        p.no=no;
        p.prev=null;
        if(top==null){
            top=p;
        }else{
            p.prev=top;
            top=p;
        }
    }
    public void traverse(){
        Node temp;
        temp=top;
        while(temp!=null){
            System.out.print(temp.no+"\t");
            temp=temp.prev;
        }
    }
    public void pop(){
        if(top==null){
            System.out.print("stack is empty...");
            
        }else{
            System.out.print("Deleted item"+top.no);
            top=top.prev;
            
        }
    }
    public void sumAllElement(){
        int sum=0;
        Node temp=top;
        while(temp!=null){
            sum=sum+temp.no;
            temp=temp.prev;
            }
        System.out.print("sum"+sum);
    }
}
public class UsingArray
{
	public static void main(String[] args) {
	    MyStack st=new MyStack();
	    
	    st.push(20);
	   
	    st.push(30);
	   
	    st.push(50);
	    st.traverse();
	    st.pop();
	    System.out.println("");
	    st.traverse();
	    st.sumAllElement();
	    
	    
	}
}
