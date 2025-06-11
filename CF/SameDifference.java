import java.util.*;
public class SameDifference {
    public static int sameDiff(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int diff = arr[i]-i;
            ans += hm.getOrDefault(diff, 0);
            hm.put(diff, hm.getOrDefault(diff, 0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            int ans = sameDiff(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}
