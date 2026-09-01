// package Arrays;
// import java.util.*;
// public class MaxDifference1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int maxDiff = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 int diff = arr[i]-arr[j];
//                 if(diff > maxDiff){
//                     maxDiff = diff;
//                 }
//             }
//         }
//         System.out.println(maxDiff);
//         sc.close();
//     }
// }

// optimised solution - max(arr)−min(arr)

package Arrays;
import java.util.*;
public class MaxDifference1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            
        }
        System.out.println(max-min);
        sc.close();
    }
}