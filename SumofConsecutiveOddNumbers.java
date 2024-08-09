import java.util.*;
public class SumofConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = Math.min(a, b);
            int y = Math.max(a, b);
            int sum = 0;
            for (int j = x+1; j < y; j++) {
                if (j%2!=0) {
                    sum = sum +j;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
