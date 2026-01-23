public class DoublyLLOperation {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }


    }
    public static  Node head;
    public static Node tail;
    public static int size;
    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
  //remove first
    public int removeFirst(){
        if(size == 0){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    //print DLL
    public void print(){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    //remove last
    public int removeLast(){
        if(size == 0){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public static void main(String[] args) {
        
        DoublyLLOperation dll = new DoublyLLOperation();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);
        dll.print();
        System.out.println("Removed first: " + dll.removeFirst());
        dll.print();
        System.out.println("Removed last: " + dll.removeLast());
        dll.print();
        
        
    }
    
}
