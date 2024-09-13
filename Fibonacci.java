import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] fib = new long[51];
        fib[1]=0;
        fib[2]=1;
        for (int i = 3; i < 51; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[n]);

        sc.close();
    }
}
