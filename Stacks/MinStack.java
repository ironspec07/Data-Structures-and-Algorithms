package Stacks;
import java.util.*;
public class MinStack {
    static Stack<Long> st = new Stack<>();
    static long min = Integer.MAX_VALUE;

    public static void push(int val) {
        if (st.size() == 0) {
            min = val;
            st.push(0l);
            return;
        }
        long diff = val-min;
        st.push(diff);
        if (val<min) {
            min = val;
        }
    }
    
    public static void pop() {
        long rem = st.pop();
        @SuppressWarnings("unused")
        long val;
        if (rem < 0) {
            val = min;
            min = min-rem;
        }
        else{
            val = min+rem;
        }
    }
    
    public static int top() {
        long rem = st.peek();
        long val;
        if (rem < 0) {
            val = min;
        }
        else{
            val = min+rem;
        }
        return (int)val;
    }
    
    public static int getMin() {
        if (st.size() == 0) {
            return -1;
        }
        return (int)min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String str = sc.nextLine().trim();
            if (str.startsWith("push ")) {
                int val = Integer.parseInt(str.substring(5));
                push(val);
            } else if (str.startsWith("pop")) {
                pop();
            }
            else if (str.startsWith("getMin")) {
                System.out.println(getMin());
            }
            else if (str.startsWith("top")) {
                System.out.println(top());
            }
        }
        sc.close();
    }
}
