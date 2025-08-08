//1760A
import java.util.*;
public class MediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    // System.out.println(min);
                }
                if (arr[i] > max) {
                    max  = arr[i];
                    // System.out.println(max);
                }
            }
            for (int i : arr) {
                if (i != min && i!= max) {
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}
