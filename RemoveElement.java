//leetcode - 27
import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val) {
                continue;
            }
            else{
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);
        sc.close();
    }
}
