import java.util.*;
public class SmartPower {
    public static int smartPow(int a,int n){
        if (n==1) {
            return a;
        }
        else if (n==0) {
            return 1;
        }
        int temp = smartPow(a, n-1);
        return temp*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(smartPow(a,n));
        sc.close();
    }
}
