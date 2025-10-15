public class RemoveDuplicateNo{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,5,1,6,3};
        System.out.print("Array after removing duplicates: ");
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

           
        }
        for(int i=0;i<=j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}