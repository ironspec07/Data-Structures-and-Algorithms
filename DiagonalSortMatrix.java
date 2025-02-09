import java.util.*;

public class DiagonalSortMatrix {

    public static int[][] sortDiagonals(int[][] grid) {
        int n = grid.length;

        // Sort bottom-left triangle (including middle diagonal)
        for (int diff = 0; diff < n; diff++) {
            List<Integer> diagonal = new ArrayList<>();
            for (int i = diff, j = 0; i < n && j < n; i++, j++) {
                diagonal.add(grid[i][j]);
            }
            // Sort in non-increasing order
            diagonal.sort((a, b) -> b - a);
            // Place back into the grid
            for (int i = diff, j = 0, k = 0; i < n && j < n; i++, j++, k++) {
                grid[i][j] = diagonal.get(k);
            }
        }

        // Sort top-right triangle
        for (int sum = 1; sum < n; sum++) {
            List<Integer> diagonal = new ArrayList<>();
            for (int i = 0, j = sum; i < n && j < n; i++, j++) {
                diagonal.add(grid[i][j]);
            }
            // Sort in non-decreasing order
            Collections.sort(diagonal);
            // Place back into the grid
            for (int i = 0, j = sum, k = 0; i < n && j < n; i++, j++, k++) {
                grid[i][j] = diagonal.get(k);
            }
        }

        return grid;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{1, 7, 3}, {9, 8, 2}, {4, 5, 6}};
        int[][] result1 = sortDiagonals(grid1);
        System.out.println("Output 1:");
        printMatrix(result1);

        int[][] grid2 = {{0, 1}, {1, 2}};
        int[][] result2 = sortDiagonals(grid2);
        System.out.println("Output 2:");
        printMatrix(result2);

        int[][] grid3 = {{1}};
        int[][] result3 = sortDiagonals(grid3);
        System.out.println("Output 3:");
        printMatrix(result3);
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}