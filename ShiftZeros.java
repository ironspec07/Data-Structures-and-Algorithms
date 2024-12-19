import java.util.*;
public class ShiftZeros {
    public static int[] zero(int[] arr){
        int n = arr.length;
        int e = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[e];
                arr[e] = temp;
                e++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] c = zero(arr);
        for (int i : c) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
