import java.util.*;

public class MultipleQueryPrefixSum {
    public static int[] prefix(int[] arr){
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i-1]+arr[i];
        }
        return pf;
    }
    public static void sumQuery(int[] arr, int[][] queries){
        int pf[] = prefix(arr);
        int k = queries.length;
        for (int i = 0; i < k; i++) {
            int l = queries[i][0]-1;
            int r = queries[i][1]-1;
            if (l>0) {
                System.out.println(pf[r]-pf[l-1]);
            }
            else{
                System.out.println(pf[r]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[][] queries = new int[k][2];
        for (int i = 0; i < k; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        sumQuery(arr,queries);
        sc.close();
    }
}