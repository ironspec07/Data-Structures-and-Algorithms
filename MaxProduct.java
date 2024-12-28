//leetcode - 1464
import java.util.*;
public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j) {
                    continue;
                }
                if ((nums[i]-1)*(nums[j]-1) > max) {
                    max = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
