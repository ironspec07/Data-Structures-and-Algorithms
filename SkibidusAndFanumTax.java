import java.util.*;
public class SkibidusAndFanumTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m1 = sc.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[m1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
            int m = arr1[0];
            int prev = -1;
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                int option1 = arr[j];
                int option2 = m-arr[j];
                if (option1 >= prev && option2 >= prev) {
                    prev = Math.min(option1, option2);
                }
                else if (option1 >= prev) {
                    prev = option1;
                }
                else if (option2 >= prev) {
                    prev = option2;
                }
                else{
                    c = 1;
                    break;
                }
            }
            if (c == 1) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
