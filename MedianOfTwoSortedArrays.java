import java.util.*;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int lo = 0;
        int hi = n1;
        int t = n1 + n2;

        while (lo <= hi) {
            int m1 = lo + (hi - lo) / 2;
            int m2 = (t + 1) / 2 - m1;

            int am = (m1 == n1) ? Integer.MAX_VALUE : nums1[m1];
            int amMinus1 = (m1 == 0) ? Integer.MIN_VALUE : nums1[m1 - 1];
            int bm = (m2 == n2) ? Integer.MAX_VALUE : nums2[m2];
            int bmMinus1 = (m2 == 0) ? Integer.MIN_VALUE : nums2[m2 - 1];

            if (amMinus1 <= bm && bmMinus1 <= am) {
                if (t % 2 == 0) {
                    return (Math.max(amMinus1, bmMinus1) + Math.min(am, bm)) / 2.0;
                } else {
                    return Math.max(amMinus1, bmMinus1);
                }
            } else if (amMinus1 > bm) {
                hi = m1 - 1;
            } else {
                lo = m1 + 1;
            }
        }
        if (n1 == 0) {
            if (n2 % 2 == 0) {
                return (nums2[n2 / 2 - 1] + nums2[n2 / 2]) / 2.0;
            } else {
                return nums2[n2 / 2];
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        double ans = findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
        sc.close();
    }
}
