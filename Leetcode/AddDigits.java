import java.util.*;
public class AddDigits {
    public static int sumDigit(int n){
        int temp = n;
        int sum = 0;
        while (temp!=0) {
            int ld = temp%10;
            sum += ld;
            temp /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n == 0) {
            System.out.println("0");
        }
        while (sum > 9 || sum == 0) {
            sum = sumDigit(n);
            n = sum;
        }
        System.out.println(sum);
        sc.close();
    }
}