import java.util.*;
public class SearchInRotatedSortedArray2 {
    public static boolean findRS2(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        while (lo<=hi) {
            int m = lo + (hi-lo)/2;
            if (nums[m] == target) {
                return true;
            }
            if (nums[lo] == nums[m] && nums[hi] == nums[m]) {
                lo = lo+1;
                hi = hi-1;
                continue;
            }
            if (nums[m] <= nums[hi]) {
                if (target >= nums[m] && target <= nums[hi]) {
                    lo = m+1;
                }
                else{
                    hi = m-1;
                }
            }
            else{
                if (target >= nums[lo] && target<= nums[m]) {
                    hi = m-1;
                }
                else{
                    lo = m+1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean ans = findRS2(arr,target);
        System.out.println(ans);
        sc.close();
    }
}
