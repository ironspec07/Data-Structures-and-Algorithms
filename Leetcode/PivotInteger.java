import java.util.*;
public class PivotInteger {
    public static int[] prefix(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
    public static int[] sufix(int[] arr){
        int n = arr.length;
        int[] ans = new int[arr.length];
        ans[n-1] = arr[n-1];
        for (int i = n-2; i >= 1; i--) {
            ans[i] = ans[i+1]+arr[i];
        }
        return ans;
    }
    public static int pivotInteger(int n){
        int[] arr = new int[n];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j++;
        }
        int[] pre = prefix(arr);
        int[] suf = sufix(arr);

        for (int i = 0; i < suf.length; i++) {
            if (pre[i] == suf[i]) {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = pivotInteger(n);
        System.out.println(ans);
        sc.close();
    }
}
