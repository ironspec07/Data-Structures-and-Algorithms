// Leetcode-3005
package Hashmap;
import java.util.*;
public class CountMaxFrequency {
    private static int maxFreq(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]) == false) {
                hm.put(nums[i], 1);
            }
            else{
                int temp = hm.get(nums[i]);
                hm.put(nums[i], temp+1);
            }
        }
        int max = 0;
        for (int val : hm.values()) {
            max = Math.max(val, max);
        }
        int result = 0;
        for (int freq : hm.values()) {
            if (freq == max) {
                result += freq;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxFreq(arr);
        System.out.println(ans);
        sc.close();
    }
}
