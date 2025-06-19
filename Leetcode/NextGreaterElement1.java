import java.util.*;
public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            while (st.size()>0 && nums2[i]>nums2[st.peek()]) {
                int idx = st.pop();
                hm.put(nums2[idx], nums2[i]);
            }
            st.push(i);
        }
        while (st.size()>0) {
            int idx = st.pop();
            hm.put(nums2[idx], -1);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] ans = nextGreaterElement(nums1,nums2);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
