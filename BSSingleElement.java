import java.util.*;
public class BSSingleElement {
    public static int single(int[] arr,int n){
        if (arr[0]!=arr[1]) {
            return arr[0];
        }
        if (arr[n-1]!=arr[n-2]) {
            return arr[n-1];
        }
        int low = 2;
        int high = n-3;
        while (low<=high) {
            int mid = low + ((high-low)/2);
            if (arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) {
                return arr[mid];
            }
            if (arr[mid]==arr[mid-1]) {
                mid--;
            }
            if (mid%2==0) {
                low = mid+2;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(single(arr,n));
        sc.close();
    }
}
