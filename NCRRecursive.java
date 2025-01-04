import java.util.Scanner;

public class NCRRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(calculateNCR(N, R));
        scanner.close();
    }

    public static int calculateNCR(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        return calculateNCR(n - 1, r - 1) + calculateNCR(n - 1, r);
    }
}
