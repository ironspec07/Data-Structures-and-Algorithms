import java.util.Scanner;

public class Gcd {
    public static long gcd(long num1, long num2) {
        while (num2 != 0) {
            long temp = num1;
            num1 = num2;
            num2 = temp % num1;
        }
        return num1;
    }
    
    public static long lcm(long num1, long num2) {
        return (num1 / gcd(num1, num2)) * num2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(gcd(a, b) +" "+lcm(a, b));

        sc.close();
    }
}
