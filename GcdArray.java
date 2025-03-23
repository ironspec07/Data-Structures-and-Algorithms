import java.util.*;
public class GcdArray {
    public static int gcd(int a , int b){
        if (a == 0) {
            return b;
        }
        int temp = gcd(b%a, a);
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            ans = gcd(ans,Math.abs(arr[i]));
        }
        System.out.println(ans);
        sc.close();
    }
}
