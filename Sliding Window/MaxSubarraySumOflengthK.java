import java.util.*;
public class MaxSubarraySumOflengthK {
    public static boolean checkDintct(int[] arr, int sp, int ep) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = sp; i <= ep; i++) {  
            if (!seen.add(arr[i])) {
                return false;
            }
        }
        return true;
    }
public static int subSumK(int[] nums, int k) {
    if (nums == null || nums.length < k) {
        return 0;
    }
    
    int sum = 0;
    for (int i = 0; i < k; i++) {
        sum = sum + nums[i];
    }
    
    int ans = 0; 
    if (checkDintct(nums, 0, k-1)) {
        ans = sum;
    }
    
    int s = 1;
    int e = k;
    while (e < nums.length) {
        sum = sum + nums[e] - nums[s-1];
        if (checkDintct(nums, s, e)) {
            if (sum > ans || ans == 0) { 
                ans = sum;
            }
        }
        s++;
        e++;
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
        int ans = subSumK(arr,k);
        System.out.println(ans);
        sc.close();
    }
}
