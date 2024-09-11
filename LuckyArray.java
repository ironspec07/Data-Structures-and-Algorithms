import java.util.*;
public class LuckyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i<min) {
                min=i;
            }
        }
        int count = 0;
        for (int i : arr) {
            if (i==min) {
                count++;
            }
        }
        if (count%2==0) {
            System.out.println("Unlucky");
        }
        else{
            System.out.println("Lucky");
        }
        sc.close();
    }
}
