import java.util.*;
public class PrimeFunction {
    public static void prime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            prime(n);
        }
        sc.close();
    }
}