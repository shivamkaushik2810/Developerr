public  class CreateAddLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public  int size;


    //add in front ll
    public void addFirst(int data){//0(1) constant time
        //1create new node
        Node newNode=new Node(data);
        size++;
        //check if ll is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
         //2new node next=head
        newNode.next=head;//link one node to another
        //3head=newNode
        head=newNode;
    }
    //add in last ll
    public void addLast(int data){//0(1) constant time
        //1create new node
        Node newNode=new Node(data);
        size++;
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
    //add in middle ll
    public  void addMiddle(int idx,int data){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    
    
    //remove first
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    //remove last
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //find second last
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    //itr search
    
        public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Found at index: "+i);
                return i;
            }
            temp=temp.next;
            i++;


        }
        return -1;


    }
    //reverse ll
    public int reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
        return 0;
    }


    //remove n'th node from end
    public void deleteNthFromEnd(int n){
        //calculate size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        //n=sz-size from start
        if(n==size){
            head=head.next;
            return;
        }
        //size-n
        int i=1;
        int indextofind=size-n;
        Node prev=head;
        while(i<indextofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        
    

    }

    
    public static void main(String[] args) {
        CreateAddLast ll=new CreateAddLast();
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
    
        ll.printLL();
        System.out.println("Size of ll: "+ll.size);
        ll.addMiddle(3,7);
        ll.printLL();
        System.out.println("Size of ll: "+ll.size);
        System.out.println("Removed first: "+ll.removeFirst());
        ll.printLL();
        System.out.println("Removed last: "+ll.removeLast());
        ll.printLL();
         System.out.println("" + ll.itrSearch(3));
            ll.reverseLL();
            ll.printLL();
            ll.deleteNthFromEnd(2);
            ll.printLL();


       
        
    } 
    
    

    
}
