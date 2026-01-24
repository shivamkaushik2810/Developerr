
public class CircularLinkedListOperation {
     static class Node {
            int data;
            Node next;
        }
        static Node addToEmpty(Node last, int data){
            if (last!=null) {
                return last;        

            }
            Node newNode=new Node();
            newNode.data=data;
            last=newNode;
            newNode.next=last;
            return last;
        }


        static Node addToFirst(Node last,int data){
            if (last==null) {
                return addToEmpty(last, data);
                
            }
            Node newNode=new Node();
            newNode.data=data;
            newNode.next=last.next;
            last.next=newNode;
            return last;

        }

        static Node addToEnd(Node last,int data){
            if (last==null) {
                return addToEmpty(last, data);
                
            }
            Node newNode=new Node();
            newNode.data=data;
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
            return last;

        }


        static Node addMiddle(Node last , int data ,int item){
            if (last==null) {
                return null;
                
            }
            Node newNode;
            Node p;
            p=last.next;
            do{
                if (p.data==item) {
                    newNode=new Node();
                    newNode.data=data;
                    newNode.next=p.next;
                    p.next=newNode;
                    if (p==last) {
                        last=newNode;
                        
                    }
                    return last;
                    
                }
                p=p.next;   
            }while(p!=last.next);
            System.out.println(item+"The given node not present in the list");
            return last;

        }



        static void traverse(Node last){
            if (last==null) {
                System.out.println("List is empty");
                return;
                
            }
            Node p;
            p=last.next;
            do{
                System.out.print(p.data+" ");
                p=p.next;

            }while(p!=last.next);
            System.out.println();
        }


        static Node deleteNode(Node last , int key){
            if (last==null) {
                return null;
                
            }
            //if only one node
            if (last.next==last && last.data==key) {
                last=null;
                return last;
                
            }
            Node temp=last;
            Node d=new Node();    //node to be deleted
            //searching for node to be deleted
            //if first node is to be deleted
            if (temp.data==key) {
            
                while (temp.next!=last) {
                    temp=temp.next;
                    
                }
                temp.next=last.next;
                last=last.next;
                
            }
            while (temp.next!=last && temp.next.data!=key) {
                temp=temp.next;
                
            }
            //node to be deleted is found
            if (temp.next.data==key) {
                d=temp.next;
                temp.next=d.next;
            }
            return last;
        }


        public static void main(String[] args) {
            Node last=null;
            last=addToEmpty(last, 6);
            last=addToFirst(last, 8);
            last=addToFirst(last, 2);
            last=addToEnd(last, 8);
            last=addToEnd(last, 12);
            last=addMiddle(last, 10, 2);
            System.out.println("Circular linked list is :");
            traverse(last);
            last=deleteNode(last, 10);
            System.out.println("After deletion the list is :");
            traverse(last);
        }
}
