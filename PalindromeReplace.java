import java.util.*;

public class PalindromeReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int n = arr.length;
        sc.close();
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] == '?' && arr[n - 1 - i] == '?') {
                arr[i] = arr[n - 1 - i] = 'a';
            } else if (arr[i] == '?') {
                arr[i] = arr[n - 1 - i];
            } else if (arr[n - 1 - i] == '?') {
                arr[n - 1 - i] = arr[i];
            } else if (arr[i] != arr[n - 1 - i]) {
                System.out.println(-1);
                return;
            }
        }
        if (n % 2 == 1 && arr[n / 2] == '?') {
            arr[n / 2] = 'a';
        }

        System.out.println(new String(arr));
        
    }
}
