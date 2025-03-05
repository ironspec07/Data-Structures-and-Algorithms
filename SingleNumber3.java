import java.util.*;
public class SingleNumber3 {
    private static boolean checkBit(int n , int i){
        if ((n & (1<<i)) == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    private static int[] single3(int[] nums){
        int v = 0;
        for (int i = 0; i < nums.length; i++) {
            v = v^nums[i];
        }
        int idx = 0;
        for (int i = 0; i < 32; i++) {
            if (checkBit(v, i) == true) {
                idx = i;
                break;
            }
        }
        int set1 = 0;
        int set2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (checkBit(num, idx) == true) {
                set2 = set2^num;
            }
            else{
                set1 = set1^num;
            }
        }
        int[] ans = {set2 , set1};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = single3(arr);
        System.out.println(ans[0]+" "+ans[1]+" ");
        sc.close();
    }
}
