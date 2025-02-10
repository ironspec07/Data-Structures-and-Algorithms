import java.util.*;
public class UnsetBit {
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
        int i = sc.nextInt();
        if (checkBit(n, i) == true) {
            int ans = n ^ (1<<i);
            System.out.println(ans);
        }
        else{
            System.out.println(n);
        }
        sc.close();
    }
}
