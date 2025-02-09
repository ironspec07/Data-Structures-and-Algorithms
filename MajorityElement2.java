import java.util.*;
public class MajorityElement2 {
    public static List<Integer> Majority2(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int val1 = nums[0];
        int count1 = 1;
        int val2 = -10;
        int count2 = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val1) {
                count1++;
            }
            else if (nums[i] == val2) {
                count2++;
            }
            else if (count1 == 0) {
                val1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                val2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        int c1 = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val1) {
                c1++;
            }
        }
        if (c1 > (n/3)) {
            ans.add(val1);
        }
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val2) {
                c2++;
            }
        }
        if (c2 > (n/3)) {
            ans.add(val2);
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
        List<Integer> maj = Majority2(arr);
        for (int i = 0; i < maj.size(); i++) {
            System.out.println(maj.get(i));
        }
        sc.close();
    }
}
