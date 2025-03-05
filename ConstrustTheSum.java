import java.util.*;

public class ConstrustTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            long maxSum = (long) n * (n + 1) / 2;
            if (s > maxSum) {
                System.out.println("-1");
            }
            List<Integer> result = new ArrayList<>();
            for (int i = n; i > 0; i--) {
                if (s >= i) {
                    result.add(i);
                    s -= i;
                }
                if (s == 0) break;
            }

            if (s == 0) {
                for (int num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
