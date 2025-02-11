import java.util.*;
public class SpiralMatrix {
    private static List<Integer> spiral(int[][] matrix){
        List<Integer> ls = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = 0;
        int rStep = n-1;
        int cStep = m-1;
        while (rStep >= 1 && cStep >= 1) {
            for (int k = 0; k < cStep; k++) {
                ls.add(matrix[i][j]);
                j++;
            }
            for (int k = 0; k < rStep; k++) {
                ls.add(matrix[i][j]);
                i++;
            }
            for (int k = 0; k < cStep; k++) {
                ls.add(matrix[i][j]);
                j--;
            }
            for (int k = 0; k < rStep; k++) {
                ls.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            rStep -= 2;
            cStep -= 2;
        }
        if (rStep == 0) {
            for (int k = 0; k < cStep+1; k++) {
                ls.add(matrix[i][j]);
                j++;
            }
        }
        else if (cStep == 0) {
            for (int k = 0; k < rStep+1; k++) {
                ls.add(matrix[i][j]);
                i++;
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        List<Integer> ls = spiral(arr);
        for (Integer i : ls) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
