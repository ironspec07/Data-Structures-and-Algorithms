import java.util.*;
public class PrintAllSubarray {
    public static void printSubarrays(int[] arr){
        for (int s = 0; s < arr.length; s++) {
            for (int e = s; e < arr.length; e++) {
                for (int i = s; i <= e; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printSubarrays(arr);
        sc.close();
    }
}
