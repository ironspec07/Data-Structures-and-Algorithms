import java.util.*;
public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int reciver = arr[i]-1;
            result[reciver] = i+1;
        }
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
