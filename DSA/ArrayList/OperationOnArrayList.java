import java.util.ArrayList;
public class OperationOnArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // get
        int element = list.get(2);
        System.out.println("Element at index 2: " + element);
        // add at index 
        list.add(1, 5); // add 5 at index 1
        System.out.println("After adding 5 at index 1: " + list);   
        // set
        list.set(2, 10); // set index 2 to 10
        System.out.println("After setting index 2 to 10: " + list);
        // remove   
        list.remove(3); // remove element at index 3
        System.out.println("After removing element at index 3: " + list);
        //contains
        boolean containsTwo = list.contains(3);
        System.out.println("List contains 2: " + containsTwo);
        // size
        int size = list.size();
        System.out.println("Size of the list: " + size);



        //print the elements using for loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();


    }
    
}
