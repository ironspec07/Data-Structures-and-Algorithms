import java.util.*;
public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isUgly(n);
        System.out.println(ans);
        sc.close();
    }
}