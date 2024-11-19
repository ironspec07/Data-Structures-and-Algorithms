import java.util.*;
public class OrderOfRemoval {
    public static int removal(int[] arr){
        Arrays.sort(arr);
        int ans = 0;
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            ans += arr[i]*(n-i);
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
        System.out.println(removal(arr));
        sc.close();
    }
}
