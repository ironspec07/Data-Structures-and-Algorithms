import java.util.*;
public class AdjacentXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            boolean ans = true;
            for (int i = 0; i < n-1; i++) {
                if (a[i] != b[i]) {
                    a[i] = a[i]^a[i+1];
                }
                if (a[i] == b[i]) {
                    continue;
                }
                else{
                    ans = false;
                    break;
                }
            }
            if (a[n-1] != b[n-1]) {
                ans = false;
            }
            if (ans) {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
