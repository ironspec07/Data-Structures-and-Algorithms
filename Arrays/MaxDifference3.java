package Arrays;

import java.util.Scanner;

public class MaxDifference3 {
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
                int diff = arr[i]-arr[j]+j-i;
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        System.out.println(maxDiff);
        sc.close();
    }
}
