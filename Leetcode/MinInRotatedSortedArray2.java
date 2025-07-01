import java.util.*;
public class MinInRotatedSortedArray2 {
    public static int findMin2(int[] nums){
        int lo = 0;
        int hi = nums.length-1;
        int ans = -1;
        while (lo <= hi) {
            int m = lo + (hi-lo)/2;
            if (nums[lo] == nums[m] && nums[m] == nums[hi]) {
                lo = lo+1;
                hi = hi-1;
                if (ans == -1 || nums[m] < nums[ans]) {
                    ans = m;
                }
            }
            else if (nums[m] <= nums[hi]) {
                if (ans == -1 || nums[m] < nums[ans]) {
                    ans = m;
                }
                hi = m-1;
            }
            else{
                if (ans == -1 || nums[lo] < nums[ans]) {
                    ans = lo;
                }
                lo = m+1;
            }
        }
        return nums[ans];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findMin2(arr);
        System.out.println(ans);
        sc.close();
    }
}
