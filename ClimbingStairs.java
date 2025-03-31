//leetcode - 70
import java.util.*;
public class ClimbingStairs {
    private static int Stairs(int n , int[] dp) {
        if(n==1 || n==2){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int a = Stairs(n-1 , dp);
        int b = Stairs(n-2 , dp);
        dp[n] = a+b;
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = Stairs(n, dp);
        System.out.println(ans);
        sc.close();
    }
}
