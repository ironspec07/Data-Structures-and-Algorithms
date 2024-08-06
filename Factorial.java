import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long f = 1;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            if (a>0) {
                for (int j = 1; j <= a; j++) {
                    f = f*j;
                }
            }
            if (a==0) {//edge case 
                f = 1;
            }
            System.out.println(f);
            f = 1;
        }
        sc.close();
    }
}
