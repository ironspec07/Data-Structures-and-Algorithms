import java.util.*;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                System.out.println(i);
                c++;
            }
        }
        if (c==0) {
            System.out.println("-1");
        }
        sc.close();
    }
}
