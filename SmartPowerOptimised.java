import java.util.Scanner;

public class SmartPowerOptimised {
    public static int smartPowOp(int a,int n){
        if (n==1) {
            return a;
        }
        int temp = smartPowOp(a, n/2);
        if (n%2==0) {
            return temp*temp;
        }
        else{
            return temp*temp*a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(smartPowOp(a,n));
        sc.close();
    }
}
