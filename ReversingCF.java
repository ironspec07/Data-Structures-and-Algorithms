import java.util.*;;
public class ReversingCF {
    private static void reverse(int[]arr, int start , int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                reverse(arr,0,i-1);
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
