import java.util.*;

public class SetMatrix0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> rows0 = new ArrayList<>();
        List<Integer> col0 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows0.add(i);
                    col0.add(j);
                }
            }
        }
        for (int row : rows0) {
            for (int col = 0; col < m; col++) {
                matrix[row][col] = 0;
            }
        }

        for (int col : col0) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}