import java.util.*;
public class GeorgeAndAccomodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int pi = sc.nextInt();
            int qi = sc.nextInt();
            if ((qi-pi) >= 2) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
