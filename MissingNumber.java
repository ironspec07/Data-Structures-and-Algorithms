//leetcode - 268
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(nums.length);
        sc.close();
    }
}
