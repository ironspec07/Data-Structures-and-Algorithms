import java.util.*;
public class PrimeFactorsQueries {
    private static int[] smallestPrime(int n){
        int[] spf = new int[n+1];
        for (int i = 0; i <= n; i++) {
            spf[i] = i;
        }
        for (int i = 2; i*i <= n; i++) {
            if (spf[i] == i) {
                for (int j = i*i; j <= n; j += i) {
                    spf[j] = Math.min(spf[j], i);
                }
            }
        }
        return spf;
    }
    private static void primeFact(int n , int[] q){
        int[] spf = smallestPrime(n);
        for (int i = 0; i < q.length; i++) {
            int x = q[i];
            while (x>1) {
                System.out.print(spf[x]+" ");
                x = x/spf[x];
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] queries = new int[q];
        for (int i = 0; i < queries.length; i++) {
            queries[i] = sc.nextInt();
        }
        primeFact(n , queries);
        sc.close();
    }
}
