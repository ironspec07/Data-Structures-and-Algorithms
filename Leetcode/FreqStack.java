import java.util.*;
class FreqStack {
    HashMap<Integer,Stack<Integer>> st;
    HashMap<Integer,Integer> hm;
    int maxFreq = 0;
    public FreqStack() {
        st = new HashMap<>();
        hm = new HashMap<>();
    }
    
    public void push(int val) {
        int f = hm.getOrDefault(val, 0);
        f++;
        hm.put(val, f);
        if (st.containsKey(f) == false) {
            st.put(f, new Stack<>());
            maxFreq = Math.max(maxFreq, f);
        }
        st.get(f).add(val);
    }
    
    public int pop() {
        int ans = st.get(maxFreq).pop();
        int f = hm.get(ans);
        f--;
        hm.put(ans, f);
        if (st.get(maxFreq).size() == 0) {
            st.remove(maxFreq);
            maxFreq--;
        }
        return ans;
    }
}