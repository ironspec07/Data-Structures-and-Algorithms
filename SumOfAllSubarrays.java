import java.util.*;
public class SumOfAllSubarrays {
    public static int subArraySum(int[] arr){
        int sum = 0;
        for (int s = 0; s < arr.length; s++) {
            for (int e = s; e < arr.length; e++) {
                for (int i = s; i <= e; i++) {
                    sum += arr[i];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = subArraySum(arr);
        System.out.println(sum);
        sc.close();
    }
}
