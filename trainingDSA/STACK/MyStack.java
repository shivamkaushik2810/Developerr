
import java.util.*;

class myStack {

    Stack s = new Stack();

    public myStack() {
        s.push("Hello");
        s.push("World");
        s.push("Java");
        s.push("Programming");
        System.out.println(s);
    }
}

public class MyStack {

    public static void main(String[] args) {
        myStack ms = new myStack();
        System.out.println("");

    }
}
