import java.util.*;
public class RemoveDuplicateFromSortedArray2 {
    public static int removeDuplicates(int[] nums) {
        int ptr1 = nums[0];
        int ptr2 = nums[0];
        int currCount = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                currCount++;
            }
            else{
                currCount=1;
            }
            if (currCount > 2) {
                nums[i] = -100000;
            }
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = removeDuplicates(arr);
        System.out.println(ans);
        sc.close(); 
    }
}
