import java.util.*;
public class TwoSumTwoPointers {
    private static int[] twoCheck(int[] nums , int target){
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int[] ans = new int[2];
        Arrays.sort(nums);
        while (i<j) {
            if ((nums[i]+nums[j]) == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            else if ((nums[i]+nums[j]) > target) {
                j--;
            }
            else{
                i++;
            }
        }
        int[] a = {-1,-1};
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = twoCheck(arr,k);
        System.out.println(ans[0]+" "+ans[1]);
        sc.close();
    }
}
