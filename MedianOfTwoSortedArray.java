// Leetcode - 4
import java.util.*;
public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int m = sc.nextInt();
        int [] arr2 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n+m];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i]; 
        }
        Arrays.sort(arr3);
        int length = n+m;
        double mid = 0.0;
        if (length%2==0) {
            mid = (arr3[length/2]+arr3[length/2-1])/2;
        }
        else {
            mid = arr3[length/2];
        }
        System.out.println(mid);
        sc.close();
    }
}
