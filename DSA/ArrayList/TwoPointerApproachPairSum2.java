//unsorted and Rotated array
import java.util.ArrayList; 
class PairSum2{
    public static boolean pairSum2(ArrayList<Integer> list ,int targer){
        int n=list.size();
        int breakPoint=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){//break point found
                breakPoint=i;
                break;
            }
        }
        int leftPointer=breakPoint+1;//smallest element
        int rightPointer=breakPoint;//largest element
        while(leftPointer!=rightPointer){
            //case 1: found the target
            if(list.get(leftPointer)+list.get(rightPointer)==targer){
                return true;
            }
            //case 2: sum is less than target -> left++
            else if(list.get(leftPointer)+list.get(rightPointer)<targer){
                leftPointer=(leftPointer+1)%n;
            }
            //case 3: sum is greater than target -> right--
            else{
                rightPointer=(n+rightPointer-1)%n;
            }
        }
        return false;
     
    }
}
public class TwoPointerApproachPairSum2 {
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        int target = 16;
        System.out.println((PairSum2.pairSum2(height, target)));
    }
    
}
