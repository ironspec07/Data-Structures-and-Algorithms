// Problem-1742A-800
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a+b) == c || (b+c) == a || (a+c) == b) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
