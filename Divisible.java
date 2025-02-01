import java.util.*;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int x = sc.nextInt();
        long remainder = 0;
        for (int i = 0; i < n.length(); i++) {
            remainder = (remainder * 10 + (n.charAt(i) - '0')) % x;
        }
        if (remainder == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
