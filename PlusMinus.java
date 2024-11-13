import java.util.*;
public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        doSomething(n,arr);
        sc.close();
    }
    public static void doSomething(int n , int arr[]){
        int cNeg=0;
        int cPos=0;
        int cZero=0;

        for (int i : arr) {
            if (i<0) {
                cNeg++;
            }
            else if (i>0) {
                cPos++;
            }
            else{
                cZero++;
            }
        }
        System.out.println(String.format("%.3f",(double)cPos/n));
        System.out.println(String.format("%.3f",(double)cNeg/n));
        System.out.println(String.format("%.3f",(double)cZero/n));
    }
}
