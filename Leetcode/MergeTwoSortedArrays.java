import java.util.*;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        int x = m-1;
        int y = n-1;
        int i = m+n-1;
        while(x >= 0 && y >= 0){
            if (nums1[x] >= nums2[y]) {
                nums1[i--] = nums1[x--];
            }
            else{
                nums1[i--] = nums2[y--];
            }
        }
        while (y >= 0) {
            nums1[i--] = nums2[y--];
        }
        for (int k : nums1) {
            System.out.print(k+" ");
        }
        sc.close();
    }
}
