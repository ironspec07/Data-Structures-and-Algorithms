import java.util.*;
public class PrefixSum {
    public static void prefixSum(int[] arr , int n){
        int[] pf = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            pf[i] = sum;
        }
        
        for (int i : pf) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        prefixSum(arr,n);
        
        sc.close();
    }
}
