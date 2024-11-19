import java.util.Scanner;

public class BinarySearch {
    public static boolean bSearch(int[] arr, int n , int k){
        int low = 0;
        int high = n-1;
        
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid]==k) {
                return true;
            }
            if (arr[mid]<k) {
                low = mid + 1;
            }
            if (arr[mid]>k) {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(bSearch(arr,n,k));
        sc.close();
    }
}
