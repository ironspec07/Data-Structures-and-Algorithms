import java.util.Scanner;

public class FloorBSearch {
    public static int floorBS(int[] arr,int n,int k){
        int low = 0;
        int high = n-1;
        int ans = 0;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid]==k) {
                return k;
            }
            if (arr[mid]<k) {
                if (arr[mid]>ans) {
                    ans = arr[mid];
                    low = mid + 1;
                }
            }
            if (arr[mid]>k) {
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(floorBS(arr,n,k));
        sc.close();
    }
}
