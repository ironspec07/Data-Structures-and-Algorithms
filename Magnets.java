import java.util.*;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a != prev) {
                count++;
            }
            prev = a;
        }
        System.out.println(count);
        sc.close();
    }
}
