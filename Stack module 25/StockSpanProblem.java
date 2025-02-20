import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

    public static void StockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];

            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);

            // Debugging Statements
            System.out.println("Day " + (i + 1) + ": Stock Price = " + stocks[i] + ", Span = " + span[i] + ", Stack = " + s);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        StockSpan(stocks, span);

        System.out.println("Final Stock Span: " + Arrays.toString(span));
    }
}
