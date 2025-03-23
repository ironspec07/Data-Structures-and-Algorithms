import java.util.*;
public class SmallestPrimeFactor {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = smallestPrime(n);
        String stringArr = Arrays.toString(ans);
        System.out.println(stringArr);
        sc.close();
    }
}
