import java.util.Scanner;
public class BreakNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t, cnt = 0, max = 0;
        t = scanner.nextLong();

        while (t-- > 0) {
            cnt = 0;
            long n = scanner.nextLong();
            while (n % 2 == 0) {
                n /= 2;
                cnt++;
            }

            if (max < cnt) {
                max = cnt;
            }
        }

        System.out.println(max);
        scanner.close();
    }
}
