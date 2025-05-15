import java.util.*;
public class DigitGame {
    private static boolean game(int[] nums){
        int sSum = 0;
        int dSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = (int)Math.floor(Math.log10(nums[i]) + 1);
            if (num == 1) {
                sSum += nums[i];
            }
            if (num == 2) {
                dSum += nums[i];
            }
        }
        if (sSum == dSum) {
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = game(arr);
        System.out.println(ans);
        sc.close();
    }
}
