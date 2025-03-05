import java.util.*;

public class DivideTwoIntegers {
    private static int divide(int A , int B){
        if (A == Integer.MIN_VALUE && B == -1) {
            return Integer.MAX_VALUE;
        }
        long a = A;
        long b = B;
        int sign = 1;
        if (A<0) {
            sign *= -1;
        }
        if (B<0) {
            sign *= -1;
        }
        a = Math.abs(a);
        b = Math.abs(b);

        long quotient = 0;
        
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                a -= (b << i);
                quotient += (1L << i);
            }
        }

        quotient = sign * quotient;

        if (quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = divide(A, B);
        System.out.println(ans);
        sc.close();
    }
}
