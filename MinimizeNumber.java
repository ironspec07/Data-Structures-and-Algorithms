import java.util.*;
public class MinimizeNumber {
    public static int operation(int[] arr,int n,int c){
        for (int i = 0; i < n; i++) {
            arr[i]=arr[i]/2;
            if (arr[i]%2==0) {
                c++;
            }
            else{
                return c;
            }
        }
        return operation(arr, n,c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]%2!=0) {
                System.out.println("0");
                System.exit(0);
            }
        }
        int c = n;
        int count=operation(arr, n,c);
        System.out.println(count/n);
        sc.close();
    }
}
