//800
import java.util.*;
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            for (int j = 0; j < arr.length; j++) {
                int b = arr[j][1];
                if (a == b) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
