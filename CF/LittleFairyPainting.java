import java.util.*;
public class LittleFairyPainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                hs.add(arr[i]);
            }
            int d = hs.size();
            int ans = Integer.MAX_VALUE;
            for (int h:hs) {
                if ((h >= d) && ans > h) {
                    ans = h;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
