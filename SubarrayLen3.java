import java.util.*;
public class SubarrayLen3 {
    public static int countSubarrays(int[] nums) {
        int count = 0;
        // for (int s = 0; s <= nums.length - 3; s++) {
        //     int[] temp = new int[3];
        //     for (int i = 0; i < 3; i++) {
        //         temp[i] = nums[s + i];
        //     }
        //     if (2*(temp[0] + temp[2]) == temp[1]) {
        //         count++;
        //     }
        // }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2 * (nums[i - 1] + nums[i + 1])) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = countSubarrays(arr);
        System.out.println(ans);
        sc.close();
    }
}
