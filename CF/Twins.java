import java.util.*;
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        Arrays.sort(arr);
        int halfAmt = sum/2;
        int selectedSum = 0;
        int coinCount = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            selectedSum += arr[i];
            coinCount++;
            if (selectedSum > halfAmt) {
                break;
            }
        }
        System.out.println(coinCount);
        sc.close();
    }
}
