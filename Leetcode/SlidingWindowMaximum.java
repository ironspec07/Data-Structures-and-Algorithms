import java.util.*;
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int max = nums[0];
        for (int i = 1; i < k; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        ans[0] = max;
        int j = 1;
        for (int i = k; i < ans.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            System.out.println(max);
            ans[j] = max;
            j++;
            
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
