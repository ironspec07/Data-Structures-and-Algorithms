import java.util.*;
public class GcdArrayLeet {
    public static int gcd(int a , int b){
        if (a == 0) {
            return b;
        }
        int temp = gcd(b%a, a);
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int a = Math.abs(nums[0]);
        int b = Math.abs(nums[nums.length-1]);
        int ans = gcd(a, b);
        System.out.println(ans);
        sc.close();
    }
}
