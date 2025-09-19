
import java.util.*;

class StringLarSmallestDiff {

    public void doCheck() {
        Stack st = new Stack();
        String s = "az";
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        char gr = (char) st.get(0);
        char sm = (char) st.get(0);

        for (int i = 0; i < st.size(); i++) {
            if ((char) st.get(i) > gr) {
                gr = (char) st.get(i);
            }
            if ((char) st.get(i) < sm) {
                sm = (char) st.get(i);
            }
        }

        System.out.println("greatest "+gr);
        System.out.println("Smallest "+sm);
        System.out.print("Difference "+ (gr - sm));

    }
}
    public class DiffStrfirstLast{
    public static void main(String[] args) {
       StringLarSmallestDiff  p = new StringLarSmallestDiff ();
        p.doCheck();
    }
    }