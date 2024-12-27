import java.util.*;
public class BaseConversion {
    public static void base(int n){
        if (n==1) {
            System.out.print(n);
            return;
        }
        base(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            base(n);
            System.out.println();
        }
        sc.close();
    }
}
