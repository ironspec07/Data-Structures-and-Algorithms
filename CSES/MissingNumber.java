package CSES;
import java.util.*;
public class MissingNumber {
    public static int missingPositive(int[] nums){
        int n = nums.length;
        int i = 0;
        while (i<n) {
            if ((nums[i]<1) || (nums[i]>n) || (i==nums[i]-1)) {
                i++;
            }
            else{
                int idx = nums[i]-1;
                if (nums[i] == nums[idx]) {
                    i++;
                }
                else{
                    swap(nums,i,idx);
                }
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]-1) {
                return (j+1);
            }
        }
        return n+1;
    }
    private static void swap(int[]arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n-1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = missingPositive(nums);
        System.out.println(ans);
        sc.close();
    }
}
