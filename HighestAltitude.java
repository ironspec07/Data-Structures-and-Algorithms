import java.util.*;
public class HighestAltitude {
    public static int[] prefix(int arr[]){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            pf[i] = pf[i-1]+arr[i];
        }
        return pf;
    }
    public static int maximum(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (i>max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gain = new int[n];
        for (int i = 0; i < gain.length; i++) {
            gain[i] = sc.nextInt();
        }
        int[] pf = prefix(gain);
        int max = maximum(pf);
        if (max<0) {
            max = 0;
        }
        sc.close();
    }
}
