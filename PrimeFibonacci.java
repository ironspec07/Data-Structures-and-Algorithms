import java.util.*;
public class PrimeFibonacci {
    public static long fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static boolean isPrime(long n){
        int count = 0;
        for(int i = 1; i*i<= n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }
                else{
                    count = count + 2;
                }
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long fibo = fibonacci(n-1);
            if (isPrime(fibo)) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
        sc.close();
    }
}