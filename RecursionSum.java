import java.util.Scanner;

public class RecursionSum {
    public static int sum(int n){
        if (n==1) {
            return 1;
        }
        int temp = sum(n-1);
        return temp+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}
