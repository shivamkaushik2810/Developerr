
import java.util.ArrayList;
class MaxNo{
    public static void main(String[] args) {
        System.out.println("i am shivam kaushiuk");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(40);
        al.add(30);
        System.out.println(al);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            if(max<al.get(i)){
                max = al.get(i);
            }



    }
    System.out.println("Maximum number is: "+max);

}
}
