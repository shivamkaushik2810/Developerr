public class ReverseArray {
    public static void reverse(int n[]) {
        int start = 0, end = n.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        reverse(n);
        System.out.print("Reversed array: ");
        for (int i : n) {
            System.out.print(i + " ");
        }
    }
}