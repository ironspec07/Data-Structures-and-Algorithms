//Leetcode - 2460
import java.util.*;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[count++] = nums[i];
        }
        while (count<nums.length) {
            nums[count++] = 0;
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.gc();
        sc.close();
    }
}