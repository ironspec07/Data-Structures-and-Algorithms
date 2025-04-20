import java.util.*;
public class SubarrayXor {
    public static int subArraySum(int[] nums){
        int sum = 0;
        for (int s = 0; s < nums.length; s++) {
            for (int e = s; e < nums.length; e++) {
                int xor = 0;
                for (int i = s; i <= e; i++) {
                    xor = xor^nums[i];
                    System.out.print(nums[i]);
                }
                System.out.println();
                sum += xor;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = subArraySum(arr);
        System.out.println(sum);
        sc.close();
    }
}
////