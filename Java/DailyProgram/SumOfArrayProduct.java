public class SumOfArrayProduct{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        System.out.println("The product of the array is: "+product);
    }
}