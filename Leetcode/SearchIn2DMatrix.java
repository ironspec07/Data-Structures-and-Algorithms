import java.util.*;
public class SearchIn2DMatrix {
    public static boolean findMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int lo = 0;
        int hi = n*m-1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            int r = mid/m; 
            int c = mid%m;
            // System.out.println(matrix[r][c]);
            if (matrix[r][c] == target) {
                return true;
            } 
            else if (matrix[r][c] < target) {
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean ans = findMatrix(arr,target);
        System.out.println(ans);
        sc.close();
    }
}
