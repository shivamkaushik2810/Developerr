public class LinersSearch {
    public static int search(int n[],int key){
        for(int i=0;i<n.length;i++){
                if(n[i]==key){
                    return i;
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        int key = 5;
        int result = search(n, key);
        if (result == -1) {
            System.out.println("Element not found");
        } 
        else {
            System.out.println("Element found at index: " + result);
        }
    }
}