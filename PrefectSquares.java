import java.util.*;
public class PrefectSquares {
    public static int minSqrt(int n , int[] dp){
        if (n==0 || n==1) {
            return n;
        }
        if (dp[n]!= -1) {
            return dp[n];
        }
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int temp = minSqrt(n-(i*i), dp);
            smallest = Math.min(smallest, temp);
        }
        dp[n] = smallest+1;
        return smallest+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = minSqrt(n,dp);
        System.out.println(ans);
        sc.close();
    }
}
