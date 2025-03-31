import java.util.*;
public class FibonacciDp {
    private static int fibHelper(int n , int[] dp) {
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int a = fibHelper(n-1 , dp);
        int b = fibHelper(n-2 , dp);
        dp[n] = a+b;
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = fibHelper(n, dp);
        System.out.println(ans);
        sc.close();
    }
}
