import java.util.*;
class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
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
    
    public void pop() {
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
    
    public int top() {
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
    
    public int getMin() {
        if (st.size() == 0) {
            return -1;
        }
        return (int)min;
    }
}