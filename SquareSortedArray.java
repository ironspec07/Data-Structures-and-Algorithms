import java.util.*;
public class SquareSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
