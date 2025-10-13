//implement of queue using two stacks
import java.util.*;
class QueueUsing2Stacks{
    Stack st1=new Stack();
    Stack st2=new Stack();
    public void enQueue(int no){
        st1.push(no);
    }
    public void deQueue(){
        if(st1.isEmpty() && st2.isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            if(st2.isEmpty()){
                while(!st1.isEmpty()){//move all the elemnt of stack 1 to stack 2
                    int top=(int)st1.peek();
                    st2.push(top);
                    st1.pop();
                }
                int deletedItem=(int)st2.pop();
                System.out.println("deleted item is: "+deletedItem);
            }
            else{
                int deletedItem=(int)st2.pop();
                System.out.println("deleted item is: "+deletedItem);
            }
        }
        
    }
    public void traverse(){
        if(st1.isEmpty()&&st2.isEmpty()){//case 1
            System.out.println("Queue is empty");
        } else{
            if(st2.isEmpty()){//case 2
                for(int i=0;i<st1.size();i++){
                    System.out.print((int)st1.get(i)+"\t");
                }
            } else{
                for(int i=st2.size()-1; i>=0; i--){//case 3
                   System.out.print((int)st2.get(i)+"\t"); 
                }
                for(int i=0;i<st1.size();i++){
                    System.out.print((int)st1.get(i)+"\t");//case 4
                }
            }
        }
    }
}
public class QueueUsingTwoStacks
{
	public static void main(String[] args) {
	    QueueUsing2Stacks q=new QueueUsing2Stacks();
	 q.traverse();
	 q.enQueue(15);
	 q.enQueue(6);
	 q.enQueue(22);
	 q.enQueue(28);
	 q.traverse();
	 q.deQueue();
	 q.traverse();
	 q.deQueue();
	}
}