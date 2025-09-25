public class  twoco{
        twoco(){
            System.out.println(" default Constructor");
        }
       
        twoco(int a){
            System.out.println(" parameterized Constructor");
        }
        twoco(double d){
            System.out.println(" double parameterized Constructor");
        }
        
       
    public static void main(String[] args) {
        twoco obj ;
        twoco obj1 = new twoco(10);
        twoco obj2 = new twoco(10.5);
        
        
    }

}
