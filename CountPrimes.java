import java.util.*;
public class CountPrimes {
    private static int sieve(int n){
        if (n == 0) {
            return 0;
        }
        boolean[] p = new boolean[n+1];
        Arrays.fill(p, true);
        p[0]=p[1]=false;
        for (int i = 2; i*i <= n; i++) {
            if (p[i] == true) {
                for (int j = i*i; j <= n; j += i) {
                    p[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (p[i] == true) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sieve(n);
        System.out.println(ans);
        sc.close();
    }
}
