import java.util.*;
public class ReplaceMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max=arr[i];
                maxIndex=i;
            }
            if (arr[i]<min) {
                min=arr[i];
                minIndex=i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex]=arr[maxIndex];
        arr[maxIndex]=temp;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
