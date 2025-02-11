import java.util.*;
public class Printboundry {
    private static void printBoundry(int[][] mat){
        int i = 0;
        int j = 0;
        int n = mat.length;
        for (int k = 0; k < n-1; k++) {
            System.out.print(mat[i][j]+" ");
            j++;
        }
        for (int k = 0; k < n-1; k++) {
            System.out.print(mat[i][j]+" ");
            i++;
        }
        for (int k = 0; k < n-1; k++) {
            System.out.print(mat[i][j]+" ");
            j--;
        }
        for (int k = 0; k < n-1; k++) {
            System.out.print(mat[i][j]+" ");
            i--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printBoundry(arr);
        sc.close();
    }
}
