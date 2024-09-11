import java.util.*;
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int ld = num%10;
            sum = sum + ld;
            num = num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
