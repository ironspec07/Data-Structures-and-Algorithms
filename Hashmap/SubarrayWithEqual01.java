package Hashmap;
import java.util.*;
public class SubarrayWithEqual01 {
    private static int subarrayCount(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int pc0 = 0;
        int pc1 = 0;
        int ans = 0;
        hm.put(0, 1);
        for (int ep = 0; ep < nums.length; ep++) {
            if (nums[ep]==0) {
                pc0++;
            }
            else{
                pc1++;
            }
            int diff = pc0-pc1;
            ans += hm.getOrDefault(diff, 0);
            hm.put(diff, hm.getOrDefault(diff, 0)+1);
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
        int ans = subarrayCount(arr);
        System.out.println(ans);
        sc.close();
    }
}
