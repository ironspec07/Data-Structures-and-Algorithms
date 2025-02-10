import java.util.*;
public class SetBit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int ans = n | (1<<i);
        System.out.println(ans);
        sc.close();
    }
}