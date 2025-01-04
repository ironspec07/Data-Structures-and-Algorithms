import java.util.*;
public class SumOfAllSubMatrix {
    public static int sumOfAllSubMatrix(int[][] arr) {
        int ans = 0;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int occ = (i+1)*(j+1)*(n-i)*(m-j);
                ans += arr[i][j]*occ;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = sumOfAllSubMatrix(arr);
        System.out.println(ans);
        sc.close();
    }
}
