import java.util.*;
public class NoOfSubarrayGcdK {
    private static int gcd(int a , int b){
        if (a==0) {
            return b;
        }
        int temp = gcd(b%a, a);
        return temp;
    }
    private static int gcdEqualToK(int[] nums , int k){
        int count = 0;
        for (int sp = 0; sp < nums.length; sp++) {
            int ans = 0;
            for (int ep = sp; ep < nums.length; ep++) {
                ans = gcd(ans , nums[ep]);
                if (ans<k) {
                    break;
                }
                if (ans == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = gcdEqualToK(arr , k);
        System.out.println(ans);
        sc.close();
        sc.close();
    }
}
