import java.util.*;
public class ChooseElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        long sum = 0;
        Arrays.sort(arr);
        int s = 0;
        int e = n-1;
        while (s<e) {
            long temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                break;
            }
            sum = sum + arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}

