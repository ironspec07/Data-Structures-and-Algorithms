import java.util.*;
public class DigitsSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = (a%10)+(b%10);
        System.out.println(sum);
        sc.close();
    }
}
