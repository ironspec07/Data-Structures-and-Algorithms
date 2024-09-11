import java.util.Scanner;

public class RotateArrayByK {
    public static void ReverseArray(int[] arr,int s,int e){
        while(s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
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
        k = k%n;
        ReverseArray(arr, 0, n-1);
        ReverseArray(arr, 0, k-1);
        ReverseArray(arr, k, n-1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
