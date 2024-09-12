import java.util.*;
public class Fibonacci {
    public static void fib(long[] fib){
        long num1=0;
        long num2=1;

        for (int i = 1; i < 51; i++) {
            fib[i]=num1;

            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fib = new long[51];
        fib(fib);
        int n = sc.nextInt();
        if (n==1) {
            System.out.println("0");
        }
        else{
            long fibN = fib[n-1]+fib[n-2];
            System.out.println(fibN);
        }
        sc.close();
    }
}
