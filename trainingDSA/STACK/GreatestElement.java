
import java.util.*;

class GreatestElementCheck {

    public void doCheck() {
        Stack st = new Stack();
        st.push(34);
        st.push(23);
        st.push(52);
        st.push(76);
        st.push(12);
        System.out.println(st);
        int gr = (int) st.get(0);
        for (int i = 1; i < st.size(); i++) {
            if (gr < (int) st.get(i)) {
                gr = (int) st.get(i);
            }
        }
        System.out.print(gr);
    }
}

 public class GreatestElement {

    public static void main(String[] args) {
        GreatestElementCheck p = new GreatestElementCheck();
        p.doCheck();
    }
} 