import java.util.Scanner;

public class Tribonecci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0)
            System.out.println("0");
        if (n == 1 || n == 2)
            System.out.println("1");
        int t0 = 0, t1 = 1, t2 = 1;
        int tn = 0;

        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        System.out.println(tn);
        sc.close();
    }
}
