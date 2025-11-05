class LinkedList{
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  Node head;
    public  Node tail;


    //add in last ll
    public void addLast(int data){//0(1) constant time
        //1create new node
        Node newNode=new Node(data);
        
        //check if ll is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //2tail.next=newNode
        tail.next=newNode;
        //3tail=newNode
        tail=newNode;
    }
    //print ll
    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

     

    //zig zag ll
    public void zigZag(){
        //step1 find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //step2 reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;

        //step3 alternate merge - zig zag merge
        Node nextL,nextR;
        while(left!=null && right!=null){
            //zig
            nextL=left.next;
            left.next=right;
            left=nextL;

            //zag
            nextR=right.next;
            right.next=left;
            right=nextR;
        }
    }

}

public class ZigZagLL {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.printLL();

        ll.zigZag();
        ll.printLL();
        
    }
    
}
