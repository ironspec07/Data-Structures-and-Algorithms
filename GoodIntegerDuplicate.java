import java.util.Arrays;
import java.util.Scanner;

public class GoodIntegerDuplicate {
    public static int goodIntDup(int[] arr,int n){
        Arrays.sort(arr);
        int ans = 0;
        int lessCount = 0;
        if (arr[0]==0) {
            ans++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=arr[i-1]) {
                lessCount=i;
            }
            else{

            }
            if (arr[i]==lessCount) {
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
        System.out.println(goodIntDup(arr,n));
        sc.close();
    }
}
