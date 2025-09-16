class InsertionSort{
    public static void insertionSort(int[] arr) {
        for(int i=0;i<=arr.length-1;i++){
            int current=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>current){
                arr[prev+1] = arr[prev];
                prev--;
        }
            arr[prev+1] = current;
        }

}
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 50,56,100,105,200,500,800,70,80,90,5, 6};
        insertionSort(arr);
        System.out.println("Sorted Array: ");
        printArr(arr);
    }
}