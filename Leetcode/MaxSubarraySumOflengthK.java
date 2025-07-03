import java.util.*;
public class MaxSubarraySumOflengthK {
    public static int subSumK(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int ans = sum;
        int s = 1;
        int e = k;
        while (e < arr.length) {
            sum = sum + arr[k] - arr[s-1];
            if (sum > ans) {
                ans = sum;
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
