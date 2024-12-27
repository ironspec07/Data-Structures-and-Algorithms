import java.util.*;
public class PrintEvenIndices {
    public static void printIndices(int[] arr , int index){
        if (index < 0) {
            return;
        }

        if (index%2==0) {
            System.out.print(arr[index]+" ");
        }
        printIndices(arr, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printIndices(arr, n-1);
        sc.close();
    }
}
