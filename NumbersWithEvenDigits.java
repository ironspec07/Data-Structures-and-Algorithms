import java.util.*;
public class NumbersWithEvenDigits {
    private static int countEven(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = (int)Math.floor(Math.log10(nums[i]) + 1);
            if (num%2 == 0) {
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
        int ans = countEven(arr);
        System.out.println(ans);
        sc.close();
    }
}