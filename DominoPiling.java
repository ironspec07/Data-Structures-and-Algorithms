import java.util.*;
public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ans = (m*n)/2;
        System.out.println(ans);
        sc.close();
    }
}