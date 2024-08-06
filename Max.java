import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (a>=max) {
                max = a;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
