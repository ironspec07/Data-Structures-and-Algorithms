import java.util.*;
public class PalindromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int e = n-1;
        int count = 0;
        while (s<e) {
            if (arr[s]!=arr[e]) {
                count=1;
                break;
            }
            s++;
            e--;
        }
        if (count==1) {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        sc.close();
    }
}
