import java.util.Stack;
class Solution2{
    public  void calculateSpan(int prices[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);  //pushing index of first day

        for(int i=1;i<prices.length;i++){
            int currPrice = prices[i];
            while(!s.isEmpty() && currPrice >= prices[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i] = i + 1;
            }
            else{
                int prevHighIndex = s.peek();
                span[i] = i - prevHighIndex;
            }
            s.push(i);
        }
    }
}

public class StockSpanProblem {
    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = new int[prices.length];
        Solution2 s2= new Solution2();
        s2.calculateSpan(prices, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }

    
    }
    
}
