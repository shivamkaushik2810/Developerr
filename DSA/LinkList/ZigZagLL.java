class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    // add at last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // print linked list
    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // zig zag linked list
    public void zigZag() {
        if (head == null || head.next == null) {
            return;
        }

        // STEP 1: find mid
        Node slow = head;
        Node fast = head.next;   // important fix

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // STEP 2: reverse second half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // STEP 3: zig-zag merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;   // store next pointers
            left.next = right;   // link left to right

            nextR = right.next;   // store next pointer of right
            right.next = nextL;   // link right to next of left

            left = nextL;//move left pointer
            right = nextR;//move right pointer
        }
    }
}

public class ZigZagLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

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
