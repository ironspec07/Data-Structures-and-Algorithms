package Arrays;
import java.util.*;
public class MaxDifference4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int diff = Math.abs(arr[i]-arr[j])+i-j;
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        System.out.println(maxDiff);
        sc.close();
    }
}
