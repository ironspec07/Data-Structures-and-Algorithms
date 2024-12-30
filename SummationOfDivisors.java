import java.util.Scanner;

public class SummationOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        long sqrtN = (long) Math.sqrt(n);

        for (long i = 1; i <= sqrtN; i++) {
            sum += i;
            if (i != n / i) {
                sum += n / i;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
