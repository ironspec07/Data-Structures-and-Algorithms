import java.util.*;
public class BitsSingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans^arr[i];
        }
        System.out.println(ans);
        sc.close();
    }
}