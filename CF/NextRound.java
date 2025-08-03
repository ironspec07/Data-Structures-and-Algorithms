import java.util.*;
public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int kth = arr[k-1];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] >= kth) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
