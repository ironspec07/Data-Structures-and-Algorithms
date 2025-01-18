import java.util.*;
public class RemoveDuplicatesFromShortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println(k);
        sc.close();
    }
}
