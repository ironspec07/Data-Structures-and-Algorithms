import java.util.*;
public class CountSetBits {
    private static boolean checkBit(int n , int i){
        if ((n & (1<<i)) == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (checkBit(n, i) == true) {
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
