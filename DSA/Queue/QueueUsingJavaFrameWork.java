import java.util.*;
public class QueueUsingJavaFrameWork {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //or
        // Queue is a interface so we can not create its object directly ..Then we can use its implementing classes like LinkedList or ArrayDeque
        //Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
