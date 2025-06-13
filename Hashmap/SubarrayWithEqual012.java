package Hashmap;
import java.util.*;
public class SubarrayWithEqual012 {
    private static int subarrayCount(char[] nums){
        HashMap<String,Integer> hm = new HashMap<>();
        int pc0 = 0;
        int pc1 = 0;
        int pc2 = 0;
        int ans = 0;
        hm.put("0@0", 1);
        for (int ep = 0; ep < nums.length; ep++) {
            if (nums[ep]=='0') {
                pc0++;
            }
            else if (nums[ep] == '1') {
                pc1++;
            }
            else {
                pc2++;
            }
            int diff1 = pc0-pc1;
            int diff2 = pc0-pc2;
            String diff = diff1+"@"+diff2;
            ans += hm.getOrDefault(diff, 0);
            hm.put(diff, hm.getOrDefault(diff, 0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int ans = subarrayCount(arr);
        System.out.println(ans);
        sc.close();
    }
}
