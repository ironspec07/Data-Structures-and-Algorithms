import java.util.*;

public class ProductExceptItself {
    public static int[] product(int[] arr){
        int n = arr.length;
        int[] pp = new int[n];
        pp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pp[i] = pp[i-1]*arr[i];
        }
        int suffix = 1;
        for (int i = n-1; i > 0; i--) {
            pp[i] = pp[i-1]*suffix;
            suffix *= arr[i];
        }
        pp[0] = suffix;
        return pp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] pp = product(arr);
        for (int i : pp) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
