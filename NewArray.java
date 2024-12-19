import java.util.*;
public class NewArray {
    public static int[] concat(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr1.length+arr2.length;
        int[] arr3 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[n+i] = arr1[i];
        }
        return arr3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr = concat(arr1, arr2);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
