import java.util.Scanner;

public class TappingRainwater {
    public static int[] sufMax(int[] arr){
        int n = arr.length;
        int[] smax = new int[n];
        smax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            smax[i] = Math.max(smax[i+1], arr[i]);
        }
        return smax;
    }
    public static int[] preMax(int[] arr){
        int n = arr.length;
        int[] pmax = new int[n];
        pmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(pmax[i-1], arr[i]);
        }
        return pmax;
    }
    public static int rainwater(int[] arr){
        int n = arr.length;
        int pmax[] = preMax(arr);
        int smax[] = sufMax(arr);

        int amt = 0;
        for (int i = 1; i < n-1; i++) {
            int lb = pmax[i-1];
            int rb = smax[i+1];
            int yb = Math.min(lb, rb);
            int contri = yb - arr[i];
            if (contri>0) {
                amt += contri;
            }
        }
        return amt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(rainwater(arr));
        sc.close();
    }
}
