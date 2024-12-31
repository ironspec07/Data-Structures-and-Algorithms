import java.util.*;
public class MaxSubarraySum {
    public static int kadnes(int[] arr){
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (sum >= 0) {
                sum = sum + arr[i];
            }
            else{
                sum = arr[i];
            }
            ans = Math.max(ans, sum);
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
        int ans = kadnes(arr);
        System.out.println(ans);
        sc.close();
    }
}
