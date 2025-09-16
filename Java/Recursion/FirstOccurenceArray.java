// write a recursive function to find the first occurence of an element in an array
public class FirstOccurenceArray{
    public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,1,5};
        int key=5;
        System.out.println(firstOcc(arr,key,0));
    }
}