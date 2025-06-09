import java.util.*;
public class MissingAndRepeatingValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 1; i <= n*n; i++) {
            hm.put(i, 0);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                hm.put(grid[i][j], hm.getOrDefault(grid[i][j], 0)+1);
            }
        }
        int[] ans = new int[2];
        for (Integer i : hm.keySet()) {
            if (hm.get(i) == 0) {
                ans[1] = i;
            }
            if (hm.get(i)==2) {
                ans[0] = i;
            }
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
