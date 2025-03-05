import java.util.*;
public class MaxAndPair {
    private static boolean checkBit(int n , int i){
        if ((n & (1<<i)) == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    private static int maxPair(int[] arr){
        for (int i = 31; i >= 0; i--) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (checkBit(arr[j], i) == true) {
                    c++;
                }
            }
            if (c >= 2) {
                for (int j = 0; j < arr.length; j++) {
                    if (checkBit(arr[j], i) == false) {
                        arr[j] = 0;
                    }
                }
            }
        }
        int idx1 = -1;
        int idx2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && idx1 == -1) {
                idx1 = i;
            }
            else if (arr[i] > 0 && idx1 != -1) {
                idx2 = i;
                break;
            }
        }
        return arr[idx1]&arr[idx2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxPair(arr);
        System.out.println(ans);
        sc.close();
    }
}
