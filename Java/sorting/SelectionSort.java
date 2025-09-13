class SelectionSort{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPos]){
                    minPos=j;
                }
            }
            // swap
            int temp = arr[i];  
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};;
        selectionSort(arr);
        System.out.println("Sorted Array: ");
        printArr(arr);
    }
}