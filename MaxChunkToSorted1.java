import java.util.*;
public class MaxChunkToSorted1 {
    public static int maxChunkToSorted(int[] arr){
        int maxTillNow = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            maxTillNow = Math.max(maxTillNow , arr[i]);
            if (maxTillNow == i) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxChunkToSorted(arr));
        sc.close();
    }
}