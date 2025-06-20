import java.util.*;
public class LargestRectangleHistogram {
    public static int largestAreaHistogram(int[] heights){
        int[] NSERight = nextSmallerElementRight(heights);
        int[] NSELeft = nextSmallerElementLeft(heights);
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int x1 = NSERight[i]-1;
            int x2 = NSELeft[i]+1;
            int width = x1-x2+1;
            int area = height*width;
            ans = Math.max(ans, area);
        }
        return ans;
    }
    public static int[] nextSmallerElementRight(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (st.size()>0 && nums[i]<nums[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i;
            }
            st.push(i);
        }
        while (st.size()>0) {
            int idx = st.pop();
            ans[idx] = nums.length;
        }
        return ans;
    }
    public static int[] nextSmallerElementLeft(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length-1; i >= 0; i--) {
            while (st.size()>0 && nums[i]<nums[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i;
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
        int[] heights = new int[n];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }
        int ans = largestAreaHistogram(heights);
        System.out.println(ans);
        sc.close();
    }
}
