import java.util.*;
public class sumOfAllSubarraysOP {
    public static int totalSum(int[] arr){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int occ = (i+1)*(n-i);
            ans += occ*arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = totalSum(arr);
        System.out.println(sum);
        sc.close();
    }
}
