import java.util.*;
public class BitwiseOrOfSubarrays {
    public static int subarrayBitwiseORs(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        for (int s = 0; s < arr.length; s++) {
            int ans = 0;
            for (int e = s; e < arr.length; e++) {
                hs.add(ans |= arr[e]);
            }
        }
        return hs.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = subarrayBitwiseORs(arr);
        System.out.println(ans);
        sc.close();
    }
}
