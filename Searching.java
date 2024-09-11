import java.util.*;
public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==k) {
                System.out.println(i);
                count=1;
                break;
            }
        }
        if (count==0) {
            System.out.println("-1");
        }
        sc.close();
    }
}
