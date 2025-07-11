import java.util.*;
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (dq.size() > 0 && nums[i] > dq.getLast()) {
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        int idx = 0;
        ans[idx++] = dq.getFirst();
        for (int i = k; i < nums.length; i++) {
            while (dq.size() > 0 && nums[i] > dq.getLast()) {
                dq.removeLast();
            }
            dq.addLast(nums[i]);
            if (dq.getFirst() == nums[i-k]) {
                dq.removeFirst();
            }
            ans[idx++] = dq.getFirst();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = maxSlidingWindow(arr,k);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
