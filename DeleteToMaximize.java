import java.util.*;
public class DeleteToMaximize {
    private static int gcd(int a , int b){
        if (a == 0) {
            return b;
        }
        int temp = gcd(b%a, a);
        return temp;
    }
    private static int[] sufGcd(int[] arr){
        int n = arr.length;
        int[] sgcd = new int[n];
        sgcd[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            sgcd[i] = gcd(sgcd[i+1], arr[i]);
        }
        return sgcd;
    }
    private static int[] preGcd(int[] arr){
        int n = arr.length;
        int[] pgcd = new int[n];
        pgcd[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pgcd[i] = gcd(pgcd[i-1], arr[i]);
        }
        return pgcd;
    }
    private static int deleteToMaximize(int[] arr){
        int[] pgcd = preGcd(arr);
        int[] sgcd = sufGcd(arr);
        int ans = 0;
        ans = Math.max(ans, sgcd[1]);
        for (int i = 1; i < arr.length - 1; i++) {
            int left = pgcd[i-1];
            int right = sgcd[i+1];
            int overallGcd = gcd(left,right);
            ans = Math.max(ans,overallGcd);
        }
        ans = Math.max(ans, pgcd[arr.length - 2]);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = deleteToMaximize(arr);
        System.out.println(ans);
        sc.close();
    }
}
