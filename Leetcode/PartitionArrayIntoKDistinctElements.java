//Leetcode-3659
import java.util.*;
public class PartitionArrayIntoKDistinctElements {
    public static boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if (n%k != 0) {
            return false;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        for (Integer i : hm.keySet()) {
            if (hm.get(i) > k) {
                return false;
            }
        }
        if (n == k) {
            for (Integer i : hm.keySet()) {
                if (hm.get(i) >= k-1) {
                    return false;
                }
            }   
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean ans = partitionArray(nums,k);
        System.out.println(ans);
        sc.close();
    }
}
