import java.util.*;
class CopyStackToOther1{
    public void  doCopy(){
         Stack st1=new Stack();
         Stack st2=new Stack();
        st1.push(45);
        st1.push(23);
        st1.push(27);
        st1.push(21);
        st1.push(11);
        st1.push(17);
        st1.push(10);
        System.out.println(st1);
        for (int i=0;i<st1.size();i++) {
            st2.push(st1.get(i));
            
        }
        System.out.println(st2);
    }
}

public class CopyStackAother {
    public static void main(String[] args) {
      CopyStackToOther1  c1=new CopyStackToOther1();
        c1.doCopy();

        
    }
    
}
