import java.util.*;
public class GcdOfEvenAndOddSun {
    public static int gcdOfOddEvenSums(int n){
        int sumEven = n * (n+1);
        int sumOdd = n*n;
        return gcd(sumEven, sumOdd);
    }
    public static int gcd(int a, int b){
        if (a == 0) {
            return b;
        }
        int temp = gcd(b%a, a);
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = gcdOfOddEvenSums(n);
        System.out.println(ans);
        sc.close();
    }
}
