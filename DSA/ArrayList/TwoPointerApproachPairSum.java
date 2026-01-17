import java.util.ArrayList;
public class TwoPointerApproachPairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int leftPointer = 0;
        int rightPointer = list.size() - 1;

        while (leftPointer != rightPointer) {
            // case 1: found the target
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            }
            // case 2: sum is less than target -> left++
            else if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++;
            }
            // case 3: sum is greater than target -> right--
            else {
                rightPointer--;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int target = 10;
        System.out.println((pairSum(height, target)));
    }
}