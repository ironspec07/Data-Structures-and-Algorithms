import java.util.*;
public class MaximumDistinctNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        long sum = 0 ;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > n) {
                break;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}