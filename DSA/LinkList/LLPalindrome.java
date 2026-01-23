class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
    public static Node head;//properties of linked list
    public static Node tail;//properties of linked list

    public void addLast(int data){//0(1) constant time
        //step 1 create new node
        Node newNode=new Node(data);
        //check if ll is empty
        if(head==null){    
            head=tail=newNode;
            return;
        }
        //step 2 tail.next=newNode
        tail.next=newNode;

        //step 3 tail=newNode

        tail=newNode;
    }
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
    //find middle of ll
    public Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is middle node
    }
    //check palindrome
    public boolean isPalindrome(){
        if(head==null || head.next==null){// base case null or single node
            return true;
        }
        //step1=find middle
        Node midNode=findMiddle(head);
        
        //step2,reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //step3,check left half and right half
        Node right=prev;//right half head
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
   
}
    
   
        


public class LLPalindrome {
    public static void main(String[] args) {
        Node ll=new Node(0);
        ll.addLast(1);
        ll.addLast(2);
      ll.addLast(2);
       ll.addLast(1);
        ll.printLL();
        System.out.println(ll.isPalindrome());
    }
    
}
