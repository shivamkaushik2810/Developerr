import java.util.ArrayList;
class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);   
        list.add(30);
        list.add(40);   
        list.add(50);
        System.out.println("ArrayList: " + list);
        list.remove(2); // Remove the element at index 2
        System.out.println("ArrayList after removal: " + list);
        list.set(1, 25); // Set the element at index 1 to 25
        System.out.println("ArrayList after setting index 1 to 25: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Element at index 3: " + list.get(3)); // Get the element at index 3
        System.out.println("Is the ArrayList empty? " + list.isEmpty());
        System.out.println("contains 30? " + list.contains(30)); // Check if the list contains 30
        System.out.println("Index of 40: " + list.indexOf(40)); // Get the index of element 40
        ;
        
    }
}