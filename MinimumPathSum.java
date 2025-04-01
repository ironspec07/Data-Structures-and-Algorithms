import java.util.*;
public class MinimumPathSum {
    private static int pathCount(int m , int n , int[][] dp ,int[][] mat){
        if (m<0 || n<0) {
            return Integer.MAX_VALUE;
        }
        if (m==0 && n==0) {
            return mat[0][0];
        }
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        int x = pathCount(m-1, n, dp,mat);
        int y = pathCount(m, n-1, dp,mat);
        dp[m][n] = mat[m][n] + Math.min(x,y);
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] obs = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                obs[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = pathCount(m-1,n-1,dp,obs);//passing index not size
        System.out.println(ans);
        sc.close();
    }
}