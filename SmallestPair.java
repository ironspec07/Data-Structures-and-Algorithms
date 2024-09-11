import java.util.*;
public class SmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= n-1; i++) {
                for (int j = i+1; j <= n; j++) {
                    int sum = arr[i-1]+arr[j-1]+j-i;
                    if (sum<min) {
                        min=sum;
                    }
                }            
            }
            System.out.println(min);
        }
        sc.close();
    }
}
