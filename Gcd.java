import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = Math.max(a, b);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (a%i==0 && b%i==0) {
                if (i>= max) {
                    max = i;
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
