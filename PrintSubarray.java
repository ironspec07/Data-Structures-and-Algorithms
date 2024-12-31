import java.util.*;
public class PrintSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
