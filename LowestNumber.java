import java.util.*;
public class LowestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]==min) {
                System.out.println(min+" "+(i+1));
                break;
            }
        }
        sc.close();
    }
}
