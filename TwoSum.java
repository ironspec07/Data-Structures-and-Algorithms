import java.util.*;
public class TwoSum {
    public static boolean twosum(int[] arr,int n,int k){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean result = twosum(arr, n, k);
        System.out.println(result);
        sc.close();
    }
}
