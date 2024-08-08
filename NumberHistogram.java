import java.util.*;
public class NumberHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            for (int j = 1; j <= a; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
        sc.close();
    }
}
