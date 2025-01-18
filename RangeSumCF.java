import java.util.Scanner;

public class RangeSumCF {

    static long sum(long num) {
        return (num * (num + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();

            long ma = Math.max(l, r);
            long mi = Math.min(l, r);

            System.out.println(sum(ma) - sum(mi - 1));
        }

        scanner.close();
    }
}
