// Leetcode - 1232
import java.util.*;
public class CheckStrainghtLine {
    public static boolean isStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
            if ((y2-y1)*(x3-x2) != (y3-y2)*(x2-x1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coordinates = new int[n][2];
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < 2; j++) {
                coordinates[i][j] = sc.nextInt();
            }
        }
        System.out.println(isStraightLine(coordinates));
        sc.close();
    }
}

