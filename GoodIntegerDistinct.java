import java.util.Arrays;
import java.util.Scanner;

public class GoodIntegerDistinct {
    public static int goodInt(int[] arr,int n){
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==i) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(goodInt(arr,n));
        sc.close();
    }
}
