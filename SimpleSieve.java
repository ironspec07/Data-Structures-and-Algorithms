import java.util.*;
public class SimpleSieve {
    private static void sieve(int n){
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
        for (int i = 1; i <= n; i++) {
            if (p[i] == true) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieve(n);
        sc.close();
    }
}
