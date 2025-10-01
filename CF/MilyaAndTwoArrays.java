//CF-2059 A
import java.util.*;
public class MilyaAndTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            HashSet<Integer> hsA = new HashSet<>();
            HashSet<Integer> hsB = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                hsA.add(a[i]);
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                hsB.add(b[i]);
            }
            if (hsA.size()+hsB.size() < 4) {
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
