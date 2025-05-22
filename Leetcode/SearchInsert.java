import java.util.*;
public class SearchInsert {
    private static int searchInsert(int[] nums , int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (nums[mid]==target) {
                return mid;
            }
            if (nums[mid]<target) {
                low = mid + 1;
            }
            if (nums[mid]>target) {
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = searchInsert(nums,target);
        System.out.println(ans);
        sc.close();
    }
}