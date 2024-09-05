import java.util.*;
public class ConvertToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0) {
            t--;
            int n = sc.nextInt();
            int count = 0;
            long result = 0;
            while (n>0) {
                if (n%2==1) {
                    count++;
                }
                n=n/2;
            }
            for (int i = 0; i < count; i++) {
                result = result + (int)Math.pow(2, i);
            }
            System.out.println(result);
        }
        sc.close();
    }
}
