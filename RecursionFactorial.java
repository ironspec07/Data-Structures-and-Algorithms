import java.util.*;
public class RecursionFactorial {
    public static int factorial(int n){
        if (n==0) {
            return 1;
        }
        int temp = factorial(n-1);
        return temp*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
