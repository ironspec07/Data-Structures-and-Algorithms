import java.util.*;
public class DivisibleNotDivisibleSumDiff {
    public static int differenceOfSums(int n, int m) {
        int divSum = 0;
        int nDivSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%m == 0) {
                divSum += i;
            }
            else{
                nDivSum += i;
            }
        }
        return (nDivSum-divSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = differenceOfSums(n, m);
        System.out.println(ans);
        sc.close();
    }
}
