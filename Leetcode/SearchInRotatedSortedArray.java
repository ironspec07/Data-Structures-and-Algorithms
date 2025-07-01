import java.util.*;
public class SearchInRotatedSortedArray {
    public static int findRS(int[] nums,int target){
        int lo = 0;
        int hi = nums.length-1;
        while (lo<=hi) {
            int m = lo + (hi-lo)/2;
            if (nums[m] == target) {
                return m;
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
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = findRS(arr,target);
        System.out.println(ans);
        sc.close();
    }
}
