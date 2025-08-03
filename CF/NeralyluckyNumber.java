import java.util.*;
public class NeralyluckyNumber {
    public static boolean isLucky(int num){
        if (num == 0) {
            return false;
        }
        while (num != 0) {
            int ld = num%10;
            // System.out.println(ld);
            if (ld != 7 && ld != 4 ) {
                // System.out.println("false");
                return false;
            }
            num = num/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count = 0;
        while (num != 0) {
            long ld = num%10;
            if (ld == 7) {
                count++;
            }
            else if (ld == 4) {
                count++;
            }
            num /= 10;
        }
        // System.out.println(count);
        boolean ans = isLucky(count);
        if (ans) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
