import java.util.*;
public class BeautifulMAtrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int r1 = -1 , c1 = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j]==1) {
                    r1 = i;
                    c1 = j;
                }
            }
        }
        int ans = Math.abs(r1-2) + Math.abs(c1-2);
        System.out.println(ans);
        sc.close();
    }
}
