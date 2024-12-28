//leetcode - 1464
import java.util.*;
public class MaxProductOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max1) {
                max2 = max1;
                max1 = nums[i];
            }
            else if (nums[i] >= max2) {
                max2 = nums[i];
            }
        }
        System.out.println((max1-1)*(max2-1));
        sc.close();
    }
}
