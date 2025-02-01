import java.util.*;
public class SpecialArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] =sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]%2 == nums[i+1]%2) {
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        sc.close();
    }
}
