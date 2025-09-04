public class LargestNo{
    public static int largest(int n[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];   

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5,50};
        int result = largest(n);
        System.out.println("Largest number is: " + result);
    }
}