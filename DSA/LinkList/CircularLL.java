
class Node {
    

    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    public static Node head;//properties of linked list
    
    public static Node tail;

    
    public static boolean  doFindCircularLL(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;// cycle present in ll
    
            }
        }
        return false;//cycle not present in ll
       
        
    }
    public static void removeCycle(){
        //1 detect cycle using floyd's algorithm
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //2 find meeting point
        slow=head;
        Node prev=null;//to remove cycle we need prev node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //3 remove cycle
        prev.next=null;



        
    }

}
public class CircularLL {
    public static void main(String[] args) {
       Node.head = new Node(1);
        Node.head.next = new Node(2);
        Node.head.next.next = new Node(3);
        Node.head.next.next.next = new Node(4);
        Node.tail = Node.head.next.next.next;

        // create a cycle manually (4 -> 2)
        Node.tail.next = Node.head.next;

        // check for cycle
        System.out.println("Cycle present: " + Node.doFindCircularLL());

        // remove the cycle
        Node.removeCycle();

        // check again
        System.out.println("Cycle present after removal: " + Node.doFindCircularLL());
        
}
}        