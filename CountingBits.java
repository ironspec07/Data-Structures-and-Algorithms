import java.util.*;
public class CountingBits {
    private static boolean checkBit(int n , int i){
        if ((n & (1<<i)) == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    private static int countBits(int n){
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (checkBit(n, i) == true) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = countBits(i);
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
