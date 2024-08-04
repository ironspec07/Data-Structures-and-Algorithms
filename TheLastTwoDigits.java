import java.util.*;
public class TheLastTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long m = (a%100)*(b%100)*(c%100)*(d%100);
        long result = m%100;
        System.out.println(String.format("%02d", result));
        sc.close();
    }
}
