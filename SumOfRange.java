import java.util.*;
public class SumOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = Math.min(a, b);
        int e = Math.max(a, b);
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = s; i <= e; i++) {
            if (i%2==0) {
                sumEven += i;
            }
            else {
                sumOdd += i;
            }
        }
        int sum = 1;
        System.out.println(sum+sumEven+sumOdd);
        // System.out.println(sumEven+sumOdd);
        // System.out.println(sumEven);
        // System.out.println(sumOdd);
        sc.close();
    }
}