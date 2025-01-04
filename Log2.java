import java.util.*;

public class Log2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            long n = sc.nextLong();
            if (n <= 0) {
            } else {
                long ans = (long)(Math.log(n) / Math.log(2));
                System.out.println(ans);
            }
        } catch (InputMismatchException e) {
        } finally {
            sc.close();
        }
    }
}