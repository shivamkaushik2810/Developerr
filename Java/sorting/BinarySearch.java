 class BinarySearch{
     static int binary(int n[],int key){
        int start=0, end=n.length-1;
        while(start<=end){
            int mid=(start + end) / 2;
            if(n[mid]==key){
                return mid;
            }
            else if(n[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
    
    }
        
        return -1; // Key not found
}
    
    public static void main(String[] args) {
        int n[] = {1, 20, 3, 4, 5};
        int key = 5;
        int result = binary(n, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}