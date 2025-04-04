import java.util.*;
public class CherryPickup {
    private static int cherryCount(int row1 , int col1 , int row2 , int[][][]dp , int[][]mat){
        int col2 = row1+col1-row2;
        if ((row1<0)||(row2<0)||(col1<0)||(col2<0)||mat[row1][col1]==-1||mat[row2][col2]==-1) {
            return Integer.MIN_VALUE;
        }
        if (row1 == 0 && col1 == 0 && row2==0 && col2==0) {
            return mat[row1][col1];
        }
        if (dp[row1][col1][row2] != -1) {
            return dp[row1][col1][row2];
        }
        int t1 = cherryCount(row1-1, col1, row2-1, dp, mat);
        int t2 = cherryCount(row1, col1-1, row2, dp, mat);
        int t3 = cherryCount(row1, col1-1, row2-1, dp, mat);
        int t4 = cherryCount(row1-1, col1, row2, dp, mat);
        int a = Math.max(t1, t2);
        int b = Math.max(t3, t4);
        int ans = Math.max(a, b);
        int contri = 0;
        if (row1 == row2 && col1 == col2) {
            contri = mat[row1][col1];
        }
        else{
            contri = mat[row1][col1] + mat[row2][col2];
        }
        dp[row1][col1][row2] = ans+contri;
        return ans+contri;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] obs = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                obs[i][j] = sc.nextInt();
            }
        }
        int[][][] dp = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        int ans = Math.max(cherryCount(n-1,n-1,n-1,dp,obs),0);//passing index not size
        System.out.println(ans);
        sc.close();
    }
}
