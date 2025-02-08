import java.util.*;
public class MajorityElement1 {
    public static int majority(int[] nums){
        int val = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            }
            else{
                if (count == 0) {
                    val = nums[i];
                    count = 1;
                }
                else{
                    count--;
                }
            }
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maj = majority(arr);
        System.out.println(maj);
        sc.close();
    }
}