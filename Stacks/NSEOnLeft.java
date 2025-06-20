package Stacks;
import java.util.*;
public class NSEOnLeft {
    public static int[] nextSmallerElement(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length-1; i >= 0; i--) {
            while (st.size()>0 && nums[i]<nums[st.peek()]) {
                int idx = st.pop();
                ans[idx] = nums[i];
            }
            st.push(i);
        }
        while (st.size()>0) {
            int idx = st.pop();
            ans[idx] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] ans = nextSmallerElement(nums1);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
