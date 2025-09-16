import java.util.*;

class Stack1{
    ArrayList<Integer> list = new ArrayList<>();
    public boolean isEmpty(){
        return list.size() == 0;
    }
    //method for push
    public void push(int data){
        list.add(data);
    }
    //pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }
    //peek
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size() - 1);
    }
}

public class StUsingArrayList{

    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}