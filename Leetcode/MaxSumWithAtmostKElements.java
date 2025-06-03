import java.util.*;
public class MaxSumWithAtmostKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        int[] limits = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < limits.length; i++) {
            limits[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Arrays.sort(grid[i]);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < limits[i]; j++) {
                pq.add(grid[i][m-1-j]);
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += pq.remove();
        }
        System.out.println(sum);
        sc.close();
    }
}
