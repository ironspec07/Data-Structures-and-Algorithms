import java.util.*;
public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long sum = 0;
            for (long j = l; j <=r; j++) {
                sum += j;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
