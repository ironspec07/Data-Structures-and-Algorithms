import java.util.*;
public class ElementsRepetingThrice {
    private static boolean checkBit(int n , int i){
        if ((n & (1<<i)) == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    private static int single3(int[] nums){
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (checkBit(nums[j],i) == true) {
                    count++;
                }
            }
            if (count%3 == 2) {
                ans = ans + (1<<i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = single3(arr);
        System.out.println(ans);
        sc.close();
    }
}
