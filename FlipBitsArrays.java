import java.util.*;
public class FlipBitsArrays {
    private static int flip(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else{
                arr[i] = -1;
                count++;
            }
        }
        int cSum = 0;
        int oSum = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (cSum >= 0) {
                cSum += arr[j];
            }
            else{
                cSum = arr[j];
            }
            oSum = Math.max(oSum,cSum);
        }
        if (oSum > 0) {
            return oSum+count;
        }
        else{
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = flip(arr);
        System.out.println(ans);
        sc.close();
    }
}
