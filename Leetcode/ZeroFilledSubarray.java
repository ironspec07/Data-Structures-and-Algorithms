import java.util.*;
public class ZeroFilledSubarray {
    public static long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            } else {
                ans += (long) count * (count + 1) / 2;
                count = 0;
            }
        }
        ans += (long) count * (count + 1) / 2;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = zeroFilledSubarray(arr);
        System.out.println(ans);
        sc.close();
    }
}
