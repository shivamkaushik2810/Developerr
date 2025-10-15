import java.util.HashSet;
public class SumOfDistinct{
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5};
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of distinct elements: "+sum);
        
}
}