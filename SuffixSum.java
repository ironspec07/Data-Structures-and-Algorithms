import java.util.*;
public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = n-m; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
        sc.close();
    }
}
