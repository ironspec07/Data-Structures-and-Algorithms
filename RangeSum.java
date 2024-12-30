import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        scanner.close();
        
        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }
        
        System.out.println(sumRange(A, B));
        System.out.println(sumEven(A, B));
        System.out.println(sumOdd(A, B));
    }
    
    public static long sumRange(long A, long B) {
        return sumUpTo(B) - sumUpTo(A - 1);
    }
    
    public static long sumEven(long A, long B) {
        if (A % 2 != 0) A++;
        if (B % 2 != 0) B--;
        if (A > B) return 0;
        return sumArithmeticSeries(A, B, 2);
    }
    
    public static long sumOdd(long A, long B) {
        if (A % 2 == 0) A++;
        if (B % 2 == 0) B--;
        if (A > B) return 0;
        return sumArithmeticSeries(A, B, 2);
    }
    
    public static long sumUpTo(long N) {
        if (N <= 0) return 0;
        return (N * (N + 1)) / 2;
    }
    
    public static long sumArithmeticSeries(long start, long end, long step) {
        long n = ((end - start) / step) + 1;
        return n * (start + end) / 2;
    }
}
