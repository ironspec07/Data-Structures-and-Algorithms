import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
