import java.util.*;
public class PowerOf4 {
    public static boolean isPowerOfFour(int n) {
        double d = n;
        while (d > 1 && n%2 == 0) {
            d = d/4;
        }
        if (d == 1) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPowerOfFour(n);
        System.out.println(ans);
        sc.close();
    }
}
