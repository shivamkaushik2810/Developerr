public class CircularQueueUsingArray {
    static class CircularQueue{
        int arr[];
        int size;
        int front;
        int rear;

        CircularQueue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }

        //isEmpty
        public boolean isEmpty(){
            return front==-1 && rear==-1;
        }

        //isFull
        public boolean isFull(){
            return (rear+1)%size==front;
        }

        //add or enqueue 
        public void add(int data){
            if (isFull()) {
                System.out.println("Queue is full");
                return;
                
            }
            if (front==-1) {//first element to be added
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove or dequeue
        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
                
            }
            int result=arr[front];
            // last element to be removed
            if (front==rear) {
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek
        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
                
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        System.out.println(cq.peek());
        System.out.println(cq.remove());
        System.out.println(cq.remove());
        cq.add(5);
        cq.add(6);
        cq.add(7);
        while (!cq.isEmpty()) {
            System.out.println(cq.remove());
            
        }
        
    }
    
}
