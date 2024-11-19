import java.util.Scanner;

public class RecursionFibonacciNumber {
    public static int fibo(int n){
        if (n==0|| n==1) {
            return n;
        }
        int temp1 = fibo(n-1);
        int temp2 = fibo(n-2);
        System.out.println(temp1+temp2);
        return temp1+temp2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }
}
