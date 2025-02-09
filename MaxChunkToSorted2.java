import java.util.*;
public class MaxChunkToSorted2 {
    public static int[] prefixMax(int[] arr){
        int[] prefix = new int[arr.length];
        int max = arr[0];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            prefix[i] = max;
        }
        return prefix;
    }
    public static int[] suffixMin(int[] arr){
        int[] suffix = new int[arr.length];
        int min = arr[arr.length-1];
        suffix[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
            }
            suffix[i] = min;
        }
        return suffix;
    }
    public static int maxChunkToSorted2(int[] arr){
        int[] prefix = prefixMax(arr);
        int[] suffix = suffixMin(arr);
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (prefix[i] <= suffix[i+1]) {
                count++;
            }
        }
        count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxChunkToSorted2(arr));
        sc.close();
    }
}
