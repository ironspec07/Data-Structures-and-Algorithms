import java.util.*;
public class BoundedMaximum {
    public static int validSubarray(int[] arr, int l , int r){
        int ans = 0;
        int lgei = 0;
        int prevValid = 0;
        for (int ep = 0; ep < arr.length; ep++) {
            if (arr[ep] > r) {
                ans += 0;
                lgei = ep+1;
                prevValid = 0;
            }
            else if (arr[ep] >= l && arr[ep] <= r) {
                ans += (ep-lgei+1);
                prevValid = ep-lgei+1;
            }
            else {
                ans += prevValid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = validSubarray(arr,l,r);
        System.out.println(ans);
        sc.close();
    }
}
