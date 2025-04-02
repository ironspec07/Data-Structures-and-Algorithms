import java.util.*;

public class OrderedTriplet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    long ans = (long) (nums[k] - nums[j]) * nums[i];
                    max = Math.max(max, ans);
                }
            }
        }
        System.out.println(Math.max(max, 0));
        sc.close();
    }
}
