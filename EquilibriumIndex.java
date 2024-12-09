import java.util.*;
public class EquilibriumIndex {
    public static int[] prefix(int[] arr){
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i-1]+arr[i];
        }
        return pf;
    }
    public static int pivotIndex(int[] arr){
        int n = arr.length;
        int pf[] = prefix(arr);
        int ans = -1;
        for (int i = 1; i < n-1; i++) {
            int ls = pf[i-1];
            int rs = pf[n-1]-pf[i];
            if (ls==rs) {
                ans = i;
            }
        }
        if (0==pf[n-1]-pf[0]) {
            ans=0;
        }
        if (pf[n-2]==0) {
            ans=n-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(pivotIndex(arr));
        sc.close();
    }
}
