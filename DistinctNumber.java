import java.util.*;
public class DistinctNumber {
    public static int distinct(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = distinct(arr);
        System.out.println(c);
        sc.close();
    }
}
