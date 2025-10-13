class DublicateZeroA{
    public void DublicateZero(String arr){
        int len=arr.length();
        for(int i=len-1;i>=0;i--){
            if (arr.charAt(i) != '9') {
                System.out.println(arr.substring(0,i+1));
                System.exit(0);
            }
        }
        
    }
    
}
public class DublicateZero{
    public static void main(String[] args){
        DublicateZeroA d=new DublicateZeroA();
        String arr="102300999";
        d.DublicateZero(arr);
    }
}