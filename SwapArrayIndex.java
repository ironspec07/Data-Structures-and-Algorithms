import java.util.Scanner;

public class SwapArrayIndex {
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt(); 
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(arr,a,b);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
