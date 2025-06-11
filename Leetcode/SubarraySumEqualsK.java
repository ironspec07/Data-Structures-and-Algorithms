import java.util.*;
public class SubarraySumEqualsK {
    private static int[] prefix(int[] arr){
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pSum[i] = pSum[i-1]+arr[i];
        }
        return pSum;
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int ans = 0;
        int[] pSum = prefix(nums);
        for (int ep = 0; ep < pSum.length; ep++) {
            int diff = pSum[ep]-k;
            ans = ans + hm.getOrDefault(diff, 0);
            hm.put(pSum[ep], hm.getOrDefault(pSum[ep], 0)+1);  
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
        int k =sc.nextInt();
        int ans = subarraySum(arr,k);
        System.out.println(ans);
        sc.close();
    }
}
