import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sumP=0;
        int sumS=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    sumP += arr[i][j];
                }
            }
        }
        int a = 0;
        int b = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==a&&j==b) {
                    sumS += arr[i][j];
                }
            }
            a++;
            b--;
        }
        System.out.println(Math.abs(sumP-sumS));
        sc.close();
    }
}
