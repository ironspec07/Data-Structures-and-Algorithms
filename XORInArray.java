// Leetcode -1486
import java.util.*;;
public class XORInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ (start+2*i);
        }
        System.out.println(ans);
        sc.close();
    }
}
