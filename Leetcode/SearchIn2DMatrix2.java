import java.util.*;
public class SearchIn2DMatrix2 {
    public static boolean findMatrix2(int[][] matrix, int target){
        int i = 0;
        int j = matrix[0].length-1;
        while (i < matrix.length && j>=0 ) {
            int mid = matrix[i][j];
            if (mid == target) {
                return true;
            } 
            else if (mid > target) {
                j--;
            }
            else{
                i++;
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
        boolean ans = findMatrix2(arr,target);
        System.out.println(ans);
        sc.close();
    }
}
