import java.util.*;
public class GCD {
    public static int gcd(int a, int b){
        if (a == 0) {
            return b;
        }
        int temp = gcd(b%a, a);
        return temp;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a,b);
        System.out.println(ans);
        sc.close();
    }
}
