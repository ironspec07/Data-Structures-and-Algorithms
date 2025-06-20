package Stacks;
import java.util.*;
public class MaxFrequencyStack {
    static HashMap<Integer,Stack<Integer>> st = new HashMap<>();
    static HashMap<Integer,Integer> hm = new HashMap<>();
    static int maxFreq = 0;

    public static void push(int val){
        int f = hm.getOrDefault(val, 0);
        f++;
        hm.put(val, f);
        if (st.containsKey(f) == false) {
            st.put(f, new Stack<>());
            maxFreq = Math.max(maxFreq, f);
        }
        st.get(f).add(val);
    }
    public static int pop() {
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
                System.out.println(pop());
            }
        }
        sc.close();
    }
}
