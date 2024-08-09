import java.util.*;
public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int grandSum = 0;
        for (int i = 1; i <= n ; i++) {
            int sum = 0;
            int t = i;
            while (t!=0) {
                int d = t%10;
                sum = sum + d;
                t = t/10;
            }
            if (sum >= a && sum <= b) {
                grandSum = grandSum + i;
            }
        }
        System.out.println(grandSum);
        sc.close();
    }
}
